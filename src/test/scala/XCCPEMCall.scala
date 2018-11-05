import com.typesafe.config.ConfigFactory
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class XCCPEMCall extends Simulation {

  val hostName = ConfigFactory.load().getString("application.pem.hostname")
  val protocol = ConfigFactory.load().getString("application.pem.protocol")
  val port = ConfigFactory.load().getString("application.pem.port")

  val httpProtocol = http
    .baseUrl(protocol + "://" + hostName + ":" + port)
    .inferHtmlResources()
    .acceptEncodingHeader("gzip,deflate")
    .contentTypeHeader("text/xml;charset=UTF-8")
    .userAgentHeader("Apache-HttpClient/4.1.1 (java 1.5)")

  val pemEndPointURL = ConfigFactory.load().getString("application.pem.endpointURL")
  val pemPayLoadPath = ConfigFactory.load().getString("application.pem.payLoadPath")
  object PEM {
    val pemCalls = exec(http("XCC PEM Call Testing")
      .post(pemEndPointURL)
      .body(ElFileBody(pemPayLoadPath))
     .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

  val ccmEndPointURL = ConfigFactory.load().getString("application.ccm.endpointURL")
  val ccmPayLoadPath = ConfigFactory.load().getString("application.ccm.payLoadPath")
  object CCM {
    val ccmCalls = exec(http("XCC CCM Call Testing")
      .get(ccmEndPointURL)
      .body(ElFileBody(ccmPayLoadPath))
      .check(
        status.is(200),
        regex("soapFault").notExists
      ))
  }

 // val xccScenario = scenario("XCCSoapCallsSimulation").exec(PEM.pemCalls, CCM.ccmCalls)
  val xccScenario = scenario("XCCSoapCallsSimulation").exec(PEM.pemCalls)

  val users = ConfigFactory.load().getInt("application.testDetails.noOfUsers")
  val duration =  ConfigFactory.load().getString("application.testDetails.duration")


  setUp(
      xccScenario.inject(rampUsers(users) during (60 seconds)),
  ).protocols(httpProtocol)
}