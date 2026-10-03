pipeline{
    agent {
        label 'java-slave'
    }
    stages{
        stage("build"){
            steps{
                echo "new branch"
            }
        }
    }
}