
pipeline {
    stages {
        stage('Build') {
            steps {
                checkout scm
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}