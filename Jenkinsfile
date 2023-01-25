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
    stage('Import results to Xray') {
      steps {
          step(
            [
              $class: 'XrayImportBuilder',
              endpointName: '/junit', 
              importFilePath: 'target/surefire-reports/*.xml', 
              importToSameExecution: 'true', 
              projectKey: 'OPSW', 
              serverInstance: '5e63abe3-7319-4bf6-9d00-c792564fa2ab'
            ]
          )
      }
    }
  }
}