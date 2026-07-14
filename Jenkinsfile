pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                withMaven(maven: 'Maven-3.9.9') {
                    sh 'mvn clean test'


        }
            }
        }
    }
}