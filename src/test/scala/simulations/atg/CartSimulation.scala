package simulations.atg

import config.ApplicationConfiguration.cartFeederCSVPath
import constants.ATGConstants._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CartSimulation extends ATGBaseSimulation {

val cartFeeder = csv(cartFeederCSVPath).circular
  val cartScn = scenario("Cart Simulation")
    .exec(getOrderSummary)
    .pause(2)
  .feed(cartFeeder)
    .exec(addMultipleItems)
    .pause(2)
    .exec(getCartSummary)
    .pause(3)
    .exec(getOrderSummary)

  setUp(
    cartScn.inject(atOnceUsers(2))
  ).protocols(httpConf)

  def getOrderSummary = {
    exec(http("Fetch Order Summary")
      .get(FETCH_ORDER_SUMMARY_ENDPOINT)
      .check(checkHttpResponseCode,verifyJsonForSuccess))
  }
  def addToCart = {
      exec(http("Add Item to Cart")
        .post(ADD_TO_CART_ENDPOINT)
        .formParam(ACTION, ADD_TO_CART_ACTION)
        .formParam(SKU_ID, "${skuId}")
        .formParam(QUANTITY, "${quantity}")
        .formParam(PRODUCT_ID, "${productId}")
        .check(checkHttpResponseCode, verifyJsonForSuccess))
  }
  def addMultipleItems = {
    repeat(4) {
      addToCart
    }
  }

  def getCartSummary = {
    exec(http("Get Cart Details")
      .get(FETCH_CART_ITEMS_ENDPOINT)
      .check(checkHttpResponseCode,verifyJsonForSuccess))
  }
}

