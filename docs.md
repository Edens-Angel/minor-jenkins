First step
Created a simple java project with a Person class where the person can have an name and a age.
The project also have 4 basic tests.

After this I downloaded Jenkins on my laptop. I have an mac so I used brew. But I prefer to work on my windows pc so I have downloaded Jenkins on my windows pc from home. I did this by going to the website and downloading the installer for windows.

After this I went to the localhost and started configuring what it asked me todo.

I have created a pipeline project in Jenkins.

I have researched how to make a jenkinsfile and I uploaded it to jenkins.

I had uploaded the project to gitlab but I had a litte struggle with it so I decided to transfer the project to github. I could easily connect github with Jenkins. I connected it with the Jenkinsfile and tested it. It worked. My Jenkinsfile looked like this.

```jenkins
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
                echo "Deploying..."
            }
        }
    }
}
```
