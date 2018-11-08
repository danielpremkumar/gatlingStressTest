package simulations.atg

import config.ApplicationConfiguration.CartFeederCSVPath
import constants.ATGConstants._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CartSimulation extends ATGBaseSimulation {

val cartFeeder = csv(CartFeederCSVPath).circular
  val cartScn = scenario("Cart Simulation")
    .exec(getOrderSummary)
    .pause(2)
  .feed(cartFeeder)
    .exec(addMultipleItems)
    .pause(2)
    .exec(getCartSummary)
    .pause(3)
    .exec(getOrderSummary)

  def cartScenario = cartScn.inject(atOnceUsers(2))
  setUp(
    cartScenario
  ).protocols(httpConf)

  def getOrderSummary = {
    exec(http("Fetch Order Summary")
      .get(FetchOrderSummaryEndPoint)
      .check(checkHttpResponseCode,verifyJsonForSuccess))
  }
  def addToCart = {
    exec(http("Add Item to Cart")
        .post(AddToCartEndPoint)
        .formParam(Action, AddToCartAction)
        .formParam(SkuId, SkuIdTemplate)
        .formParam(Quantity, QuantityTemplate)
        .formParam(ProductId, ProductIdTemplate)
        .check(checkHttpResponseCode, verifyJsonForSuccess))
  }
  def addMultipleItems = {
    repeat(4) {
      addToCart
    }
  }

  def getCartSummary = {
    exec(http("Get Cart Details")
      .get(FetchCartItemsEndPoint)
      .check(checkHttpResponseCode,verifyJsonForSuccess))
  }
}

