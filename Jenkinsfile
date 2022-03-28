// Declarative //
pipeline {
    agent any
      tools {
           maven 'Maven3'
  }
    stages {
        stage('checkout') {
            steps {
               checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '28e33f76-fc84-47e7-8c20-3db327cd0de5', url: 'https://github.com/Shambhu-repo/SpringBoot1.git']]])
            }
        }
        stage('build'){
            steps{
        sh '''
                echo    "PATH = ${PATH}"
                 echo   "M2_HOME = ${M2_HOME}"
                '''
          echo ' i am from maven build'
          
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
// Script //
