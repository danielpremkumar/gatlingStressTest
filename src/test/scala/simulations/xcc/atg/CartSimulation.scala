package simulations.xcc.atg

import config.ApplicationConfiguration.pemURL
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CartSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl(pemURL)

}
