pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building Java application...'
                bat 'javac Main.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing Java application...'
                bat 'java Main'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                echo 'Application deployed successfully!'
            }
        }
    }
}