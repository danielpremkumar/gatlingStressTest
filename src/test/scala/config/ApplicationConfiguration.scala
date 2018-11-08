package config

import com.typesafe.config.ConfigFactory

object ApplicationConfiguration  {

  final val config = ConfigFactory.load()
  final val pemHostName = config.getString("application.pem.hostname")
  final val pemProtocol = config.getString("application.pem.protocol")
  final val pemPort = config.getString("application.pem.port")
  final val pemURL = pemProtocol + "://" + pemHostName + ":" + pemPort
  final val ccmHostName = config.getString("application.ccm.hostname")
  final val ccmProtocol = config.getString("application.ccm.protocol")
  final val ccmPort = config.getString("application.ccm.port")
  final val ccmURL = ccmProtocol + "://" + ccmHostName + ":" + ccmPort
  final val pemEndPointURL = config.getString("application.pem.endpointURL")
  final val pemPayLoadPath = config.getString("application.pem.payLoadPath")
  final val ccmEndPointURL = config.getString("application.ccm.endpointURL")
  final val ccmPayLoadPath = config.getString("application.ccm.payLoadPath")
  final val users = config.getInt("application.testDetails.noOfUsers")
  final val duration =  config.getString("application.testDetails.duration")
  final val ccmFeederCSVPath =  config.getString("application.ccm.ccmFeederCSVPath")
  final val atgRestServiceBaseURL = config.getString("application.atg.rest.baseURL")
  final val cartFeederCSVPath = config.getString("application.atg.cart.feederCSVPath")

}
