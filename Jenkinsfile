pipeline {
    agent any

    tools { 
            maven 'Maven 3.3.9' 
            jdk 'jdk8' 
        }

    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        
        stage("Build") {
            steps {
                echo "Building..."
            }
        }

       stage("Test") {
            steps {
                echo "Test..."
            }
        }

        stage("Deploy") {
            steps {
                // sh 'mvn -B -DskipTests clean package'
                echo "Deploying..."
            }
        }
    }
}