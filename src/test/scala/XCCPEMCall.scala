package test.scala

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class XCCPEMCall extends Simulation {

  val httpProtocol = http
    .baseUrl("http://718724-LBXCCSITpmm1.ascenaretail.com:8091")
    .inferHtmlResources()
    .acceptEncodingHeader("gzip,deflate")
    .contentTypeHeader("text/xml;charset=UTF-8")
    .userAgentHeader("Apache-HttpClient/4.1.1 (java 1.5)")

  object PEM {
    val pemCalls = exec(http("XCC PEM Call Testing")
      .post("/PromotionEngineWebServiceWrapper/PromotionEngineWebServiceWrapper?wsdl")
      .body(ElFileBody("PEMRequest.xml"))
     .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

  object CCM {
    val ccmCalls = exec(http("XCC CCM Call Testing")
      .get("/new-arrivals")
      .body(ElFileBody("CCMRequest.xml"))
      .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }
  println("Testing Gatling")
  val xccScenario = scenario("XCCSoapCallsSimulation").exec(PEM.pemCalls, CCM.ccmCalls)

  setUp(
      xccScenario.inject(rampUsers(300) during (60 seconds)),
  ).protocols(httpProtocol)
}