import ApplicationConfiguration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


class XCCPEMCall extends Simulation {

  println("PEM Call made to this URL/server : " + pemURL)
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
    val ccmCalls = exec(http("XCC CCM Call Testing")
      .get(ccmEndPointURL)
      .body(ElFileBody(ccmPayLoadPath))
      .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

  val xccScenario = scenario("XCCSoapCallsSimulation").exec(PEM.pemCalls, CCM.ccmCalls)

  setUp(
      xccScenario.inject(rampUsers(users) during (3 seconds)),
  ).protocols(httpProtocol)
}