pipeline {
    agent any

    stages {
        stage('Get Code') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/mhassan-cpu/Restfull-Booker.git'
            }
        }

        stage('Run Test') {
            steps {
                bat 'newman run "Restful Booker.postman_collection.json" -e Testing.postman_environment.json --reporters=cli,htmlextra'
            }
        }
    }
}