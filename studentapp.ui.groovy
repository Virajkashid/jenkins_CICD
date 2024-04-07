pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git branch: 'main', credentialsId: 'ssh', url: 'git branch: 'main ', url: 'https://github.com/Virajkashid/jenkins_CICD.git''
                echo 'pull'
            }
        }
        stage('build') {
            steps {
                echo 'build done'
            }
        }
        stage('quality-test') {
            steps {
                echo 'quality-test'
            }
        }
        stage('test') {
            steps {
                echo 'test done'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy done'
            }
        }
    }
}