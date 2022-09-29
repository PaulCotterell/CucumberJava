pipeline {
  agent any
  stages {
    stage('Run Tests') {
      steps {
        sh "google-chrome --version"
        sh './mvnw clean test'
      }
    
    }
  }
}