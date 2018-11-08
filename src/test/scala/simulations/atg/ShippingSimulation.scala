package simulations.atg

import constants.ATGConstants._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ShippingSimulation extends ATGBaseSimulation {

  val shippingScn = scenario("Shipping Scenario")
    .exec(http("Shipping")
    .get(GetGCShippingAddressEndPoint)
    .check(checkHttpResponseCode,verifyJsonForSuccess))

  setUp(
    shippingScn.inject(atOnceUsers(2))
  ).protocols(httpConf)

}
