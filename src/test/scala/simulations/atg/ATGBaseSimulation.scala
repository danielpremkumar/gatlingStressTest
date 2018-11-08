package simulations.atg

import config.ApplicationConfiguration.AtgRestServiceBaseURL
import constants.ATGConstants._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class ATGBaseSimulation extends Simulation {

  def httpConf = {
    http
      .baseUrl(AtgRestServiceBaseURL)
      .header(Accept,ApplicationJson)
      //.proxy(Proxy("localhost",8888).httpsPort(8888))
  }
  def checkHttpResponseCode =  status.in(200 to 210)
  def verifyJsonForSuccess = {
    jsonPath(StatusJsonElement)
      .is(Success)
  }

  def apiCall(reqName: String, apiURL: String) = {
    http(reqName)
      .get(apiURL)
      .check(checkHttpResponseCode,verifyJsonForSuccess)
  }

}
