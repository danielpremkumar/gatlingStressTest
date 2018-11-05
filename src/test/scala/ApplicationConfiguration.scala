import com.typesafe.config.ConfigFactory

object ApplicationConfiguration  {

  final val hostName = ConfigFactory.load().getString("application.pem.hostname")
  final val protocol = ConfigFactory.load().getString("application.pem.protocol")
  final val port = ConfigFactory.load().getString("application.pem.port")
  final val pemEndPointURL = ConfigFactory.load().getString("application.pem.endpointURL")
  final val pemPayLoadPath = ConfigFactory.load().getString("application.pem.payLoadPath")
  final val ccmEndPointURL = ConfigFactory.load().getString("application.ccm.endpointURL")
  final val ccmPayLoadPath = ConfigFactory.load().getString("application.ccm.payLoadPath")
  final val users = ConfigFactory.load().getInt("application.testDetails.noOfUsers")
  final val duration =  ConfigFactory.load().getString("application.testDetails.duration")
}
