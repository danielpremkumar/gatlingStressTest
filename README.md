gatling-stress-test
===================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvnw gatling:test -Dgatling.simulationClass=simulations.xcc.XCCPEMCall 

or simply:

    $mvnw gatling:test

In case of Env specific URL and values need to be used from a different conf file

     $mvnw gatling:test -Dconfig.resource=application-dev.conf
     
     mvnw gatling:test -Dconfig.resource=application-dev.conf -Dlogback.configurationFile=conf/logback-debug.xml

Gradle Config

Run all simulations

    $ gradle gatlingRun
 
 Run single simulation implemented in com.project.simu.MySimulation class

    $ gradlew gatlingRun-simulations.xcc.XCCPEMCall  

Info about gatling-plugin    
https://github.com/lkishalmi/gradle-gatling-plugin
    