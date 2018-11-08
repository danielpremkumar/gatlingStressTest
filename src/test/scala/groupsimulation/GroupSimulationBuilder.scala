package groupsimulation

import io.gatling.core.structure.PopulationBuilder
import simulations.atg.{ATGBaseSimulation, CartSimulation, ShippingSimulation}

class GroupSimulationBuilder extends ATGBaseSimulation {

  setUp(new CartSimulation().cartScenario,
        new ShippingSimulation().shippingScenario)
    .protocols(httpConf)
}
