package runners

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import simulations.atg.ShippingSimulation

object GatlingRunner {

  def main(args: Array[String]): Unit = {
    val simClass = classOf[ShippingSimulation].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)

    Gatling.fromMap(props.build)
  }

}
