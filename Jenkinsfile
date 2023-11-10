pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your version control system
                checkout scm
            }
        }

        stage('Test') {
            steps {
                // Build the Maven project
                sh 'mvn test'
            }
        }

        
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean install package'
            }
        }

       stage('Archive') {
            steps {
                // Archive the generated WAR file
                archiveArtifacts artifacts: 'target/mywebapp.war'
            }
        }
    }
}
