package simulations.xcc

import config.ApplicationConfiguration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._


class XCCPEMCall extends Simulation {

  val httpProtocol = http
    .baseUrl(pemURL)
    .inferHtmlResources()
    .acceptEncodingHeader("gzip,deflate")
    .contentTypeHeader("text/xml;charset=UTF-8")
    .userAgentHeader("Apache-HttpClient/4.1.1 (java 1.5)")

  object PEM {
    val pemCalls = exec(http("XCC PEM Call Testing")
      .post(pemEndPointURL)
      .body(ElFileBody(pemPayLoadPath))
     .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

  object CCM {
    val couponCSVFeeder = csv(ccmFeederCSVPath).circular
    val ccmCalls =
      feed(couponCSVFeeder)
      .exec(http("XCC CCM Call Testing")
      .get(ccmEndPointURL)
      .body(ElFileBody(ccmPayLoadPath))
      .check(
       // bodyString.saveAs( "RESPONSE_DATA" ),
        status.is(200),
        regex("soapFault").notExists
      )
      )
  }

  val xccScenario = scenario("XCCSoapCallsSimulation").exec( PEM.pemCalls, CCM.ccmCalls)
//    .exec( session => {
//    println( "Some Restful Service:" )
//    println( session( "RESPONSE_DATA" ).as[String] )
//    session
//  })

  setUp(
      xccScenario.inject(rampUsers(users) during (3 seconds)),
  ).protocols(httpProtocol)
}