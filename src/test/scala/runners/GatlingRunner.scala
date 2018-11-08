package runners

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import simulations.atg.CartSimulation

object GatlingRunner {

  def main(args: Array[String]): Unit = {
    val simClass = classOf[CartSimulation].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)

    Gatling.fromMap(props.build)
  }

}
