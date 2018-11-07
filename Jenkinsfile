node {
   def mvnHome
   stage('Preparation') {
      git 'https://github.com/nerdylegend/gatlingStressTest.git'
      mvnHome = tool 'M3'
   }
   stage('Performance') {
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' gatling:test"
      } else {
         bat(/"${mvnHome}\bin\mvn" gatling:test/)
      }
   }
   stage('Results') {
        gatlingArchive()
   }
}