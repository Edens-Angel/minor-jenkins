pipeline {
    agent any

    stages {
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