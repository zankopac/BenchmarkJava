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
                sh 'runBenchmark.sh'
            }
        }
    }
}
