pipeline {

    agent any 

    stages {

        stage("build") {

            steps {
                echo '>>>>>> building the application...'
            }
        }

        stage("test banana") {
            when {
                expression {
                    env.BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo 'testing the application bananas...'
            }
        }

        stage("deploy") {

            steps {
                echo 'deploying the application...'
            }
        }

    }
}