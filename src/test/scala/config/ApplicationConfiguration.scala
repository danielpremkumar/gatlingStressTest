package config

import com.typesafe.config.ConfigFactory

object ApplicationConfiguration  {

  final val Configs = ConfigFactory.load()
  final val PemHostName = Configs.getString("application.pem.hostname")
  final val PemProtocol = Configs.getString("application.pem.protocol")
  final val PemPort = Configs.getString("application.pem.port")
  final val PemURL = PemProtocol + "://" + PemHostName + ":" + PemPort
  final val CcmHostName = Configs.getString("application.ccm.hostname")
  final val CcmProtocol = Configs.getString("application.ccm.protocol")
  final val CcmPort = Configs.getString("application.ccm.port")
  final val CcmURL = CcmProtocol + "://" + CcmHostName + ":" + CcmPort
  final val PemEndPointURL = Configs.getString("application.pem.endpointURL")
  final val PemPayLoadPath = Configs.getString("application.pem.payLoadPath")
  final val CcmEndPointURL = Configs.getString("application.ccm.endpointURL")
  final val CcmPayLoadPath = Configs.getString("application.ccm.payLoadPath")
  final val Users = Configs.getInt("application.testDetails.noOfUsers")
  final val Duration =  Configs.getString("application.testDetails.duration")
  final val CcmFeederCSVPath =  Configs.getString("application.ccm.ccmFeederCSVPath")
  final val AtgRestServiceBaseURL = Configs.getString("application.atg.rest.baseURL")
  final val CartFeederCSVPath = Configs.getString("application.atg.cart.feederCSVPath")
}
