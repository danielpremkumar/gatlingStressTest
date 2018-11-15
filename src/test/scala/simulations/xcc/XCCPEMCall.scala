package simulations.xcc

import config.ApplicationConfiguration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._


class XCCPEMCall extends Simulation {

  def httpProtocol = http
    .baseUrl(PemURL)
    .inferHtmlResources()
    .acceptEncodingHeader("gzip,deflate")
    .contentTypeHeader("text/xml;charset=UTF-8")
    .userAgentHeader("Apache-HttpClient/4.1.1 (java 1.5)")

  object PEM {
    val pemCalls = exec(http("XCC PEM Call Testing")
      .post(PemEndPointURL)
      .body(ElFileBody(PemPayLoadPath))
     .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

  object CCM {
    println("ccmFeederCSVPath : " + CcmFeederCSVPath)
    println("pemPayLoadPath : " + PemPayLoadPath)
    println("ccmPayLoadPath : " + CcmPayLoadPath)
    val couponCSVFeeder = csv(CcmFeederCSVPath).circular
    val ccmCalls =
      feed(couponCSVFeeder)
      .exec(http("XCC CCM Call Testing")
      .get(CcmEndPointURL)
      .body(ElFileBody(CcmPayLoadPath))
      .check(
       // bodyString.saveAs( "RESPONSE_DATA" ),
        status.is(200),
        regex("soapFault").notExists
      )
      )
  }


  def xccScenario = scenario("XCCSoapCallsSimulation").exec( PEM.pemCalls, CCM.ccmCalls)
//    .exec( session => {
//    println( "Some Restful Service:" )
//    println( session( "RESPONSE_DATA" ).as[String] )
//    session
//  })
  def xccSCN = {
  xccScenario.inject(
    nothingFor(5 seconds),
    //   constantUsersPerSec(10) during (10 seconds)
    atOnceUsers(5),
    //        incrementConcurrentUsers(incrementConcurrentUsers)
    //          .times(7)
    //          .eachLevelLasting(5 seconds)
    //          .separatedByRampsLasting(70 seconds)
    //          .startingFrom(2),
    rampUsers(12000) during (60 seconds))
}

  setUp(xccSCN)
    .protocols(httpProtocol.inferHtmlResources())
}