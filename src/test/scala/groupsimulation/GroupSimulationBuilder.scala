package groupsimulation

import io.gatling.core.structure.PopulationBuilder
import simulations.atg.{ATGBaseSimulation, CartSimulation, ShippingSimulation}

class GroupSimulationBuilder extends ATGBaseSimulation {

  val cartScenario = new CartSimulation().cartScenario
  val shippingScenario = new ShippingSimulation().shippingScenario
  val scn : List[PopulationBuilder] = List(cartScenario,shippingScenario)

  setUp(scn)
    .protocols(httpConf)

}
