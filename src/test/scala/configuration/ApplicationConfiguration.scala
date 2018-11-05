package configuration

import com.typesafe.config.ConfigFactory

class ApplicationConfiguration {

  val hostName = ConfigFactory.load().getString("application.pem.hostname")
  val protocol = ConfigFactory.load().getString("application.pem.protocol")
  val port = ConfigFactory.load().getString("application.pem.port")
  val pemEndPointURL = ConfigFactory.load().getString("application.pem.endpointURL")
  val pemPayLoadPath = ConfigFactory.load().getString("application.pem.payLoadPath")
  val ccmEndPointURL = ConfigFactory.load().getString("application.ccm.endpointURL")
  val ccmPayLoadPath = ConfigFactory.load().getString("application.ccm.payLoadPath")
}
