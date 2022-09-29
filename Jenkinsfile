pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh "cat /etc/os-release"
        sh "google-chrome --version"
        sh './mvnw clean test'
      }
    
    }
  }
}