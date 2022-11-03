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
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rihad11/batch12Sept2022.git']]])
            sh 'mvn clean test'
             
         }
      }
      stage('Deploy') {
         steps {
            echo 'deploy to staging server'
             
         }
      }
   }
}
