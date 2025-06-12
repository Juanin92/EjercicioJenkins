pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'JDK21'
    }

    stages {
        stage('Clonar') {
            steps {
                git 'https://github.com/Juanin92/EjercicioJenkins'
            }
        }
        stage('Compilar') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Probar') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo "🎉El build fue exitoso"
        }

        failure {
            echo "💥 El build falló"
        }
    }
}