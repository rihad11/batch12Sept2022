pipeline {
   agent any

   stages {
      stage('building') {
         steps {
            echo 'building dev project'
         }
}       
    stage('Testing') {
         steps {
            echo 'testing dev project'
            sh 'mvn test'
             
         }
      }
      stage('Deploy') {
         steps {
            echo 'deploy to staging server'
             
         }
      }
   }
}
