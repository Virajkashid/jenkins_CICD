pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Here we are pullin our project repository'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Here we doing build operation'
            }
        }
        stage('Test') {
            steps {
                echo 'Here we are testing '
            }
        }
        stage('Quality Test') {
            steps {
                echo 'Here we are testing the quality'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        
        }
    }
}