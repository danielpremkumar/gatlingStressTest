package config

import com.typesafe.config.ConfigFactory
import scala.io.Source._

object ApplicationConfiguration  {

  final val pemHostName = ConfigFactory.load().getString("application.pem.hostname")
  final val pemProtocol = ConfigFactory.load().getString("application.pem.protocol")
  final val pemPort = ConfigFactory.load().getString("application.pem.port")
  final val pemURL = pemProtocol + "://" + pemHostName + ":" + pemPort
  final val ccmHostName = ConfigFactory.load().getString("application.ccm.hostname")
  final val ccmProtocol = ConfigFactory.load().getString("application.ccm.protocol")
  final val ccmPort = ConfigFactory.load().getString("application.ccm.port")
  final val ccmURL = ccmProtocol + "://" + ccmHostName + ":" + ccmPort
  final val pemEndPointURL = ConfigFactory.load().getString("application.pem.endpointURL")
  final val pemPayLoadPath = ConfigFactory.load().getString("application.pem.payLoadPath")
  final val ccmEndPointURL = ConfigFactory.load().getString("application.ccm.endpointURL")
  final val ccmPayLoadPath = ConfigFactory.load().getString("application.ccm.payLoadPath")
  final val users = ConfigFactory.load().getInt("application.testDetails.noOfUsers")
  final val duration =  ConfigFactory.load().getString("application.testDetails.duration")
  final val ccmFeederCSVPath =  ConfigFactory.load().getString("application.ccm.ccmFeederCSVPath")

}
