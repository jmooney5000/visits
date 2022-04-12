def gv

pipeline {

    agent any

    environment {
        NEW_VERSION = '1.2.3.4a'
        SERVER_CREDENTIALS = credentials('my-pipeline-git-credentials')
    }

    stages {

        stage("init") {

            steps {
                script {
                    gv = load "script.groovy" 
                }
            }
        }

        stage("build front end") {

            steps {
                script {
                    gv.buildApp()
                }
            }
        }

        stage("test banana") {
            when {
                expression {
                    env.BRANCH_NAME == 'dev'
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }

        stage("deploy") {

            steps {
                script {
                    gv.deployApp()
                }
            }
        }

    }
}