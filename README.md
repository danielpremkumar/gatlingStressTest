gatling-stress-test
===================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationClass=simulations.xcc.XCCPEMCall 

or simply:

    $mvn gatling:test

In case of Env specific URL and values need to be used from a different conf file

     $mvn gatling:test -Dconfig.resource=application-dev.conf
     
     mvn gatling:test -Dconfig.resource=application-dev.conf -Dlogback.configurationFile=conf/logback-debug.xml