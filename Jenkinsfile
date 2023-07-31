pipeline {
    agent any
    tools {
            maven "MavenJenkins"
            jdk "JavaJenkins"
        }
    stages {

         stage('Initialize'){
                steps{
                    echo "PATH = ${M2_HOME}/bin:${PATH}"
                    echo "M2_HOME = /Applications/apache-maven-3.8.2"
                }
            }
         stage('Build') {
            steps {
                dir("/Users/testinium/.jenkins/workspace/UcuzabiletExample") {
                sh 'mvn clean install -DskipTests=true'
                echo 'Building...'
                }

            }
         }

        stage('Test') {
            steps {
                dir("/Users/testinium/.jenkins/workspace/UcuzabiletExample") {
                sh 'mvn test'
                echo 'Test ok...'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
