pipeline {
    agent { docker 'maven:3.8.5-openjdk-8'  }
    stages {
        stage('startup') {
            steps {
                echo "Test"
                sh 'mvn --version'
            }
        }
        stage('deploy') {
            steps {
                sh 'curl -k -X https://localhost:8443/benchmark/'
                sh './runBenchmark.sh'
                sh 'curl -k -X https://localhost:8443/benchmark/'
            }
        }
    }
}
