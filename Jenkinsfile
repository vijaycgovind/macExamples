
node
{
   def mp = tool name: '/Users/vijaygovind/apache-maven-3.5.4', type: 'maven'
  
   stage('Preparation') { 
      // Get some code from a GitHub repository
      echo 'About to hit respository from github'
      git 'https://github.com/vijaycgovind/macExamples.git'
      
   }
   
   stage('Clean') {
      // Run the maven clean
    // def mp = tool name: '/Users/vijaygovind/apache-maven-3.5.4', type: 'maven'
      echo 'CLEEEEEAAAAAANING'
      sh "${mp}/bin/mvn clean"
   
   }
    stage ('Test')
    {
         sh "${mp}/bin/mvn test"
   }
   
   stage('----PACKAGE-----') 
   {
    sh "${mp}/bin/mvn package"
   }
}
