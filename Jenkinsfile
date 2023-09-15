pipeline {
    agent any

    stages {
        stage('Android') {
            steps {
                sh './gradlew testAndroid'
            }
        }
        stage('IOS') {
            steps {
                sh './gradlew testIOS'
            }
        }
    }
}
