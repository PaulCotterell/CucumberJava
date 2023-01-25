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
              serverInstance: '2c67d48e-a778-4476-b5af-2810f9bdbb9b'
            ]
          )
      }
    }
  }
}