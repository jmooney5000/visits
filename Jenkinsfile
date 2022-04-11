pipeline {

    agent any

    environment {
        NEW_VERSION = '1.2.3.4a'
        SERVER_CREDENTIALS = credentials('my-pipeline-git-credentials')
    }

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
                echo 'testing the application bananas.....'
                echo "building version ${NEW_VERSION}"
                echo "my-pipeline-git-credentials ${SERVER_CREDENTIALS}"
            }
        }

        stage("deploy") {

            steps {
                echo 'deploying the application...'
                withCredentials([
                    usernamePassword(credentialsId: 'my-pipeline-git-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')
                ]) {
                    echo "username password: ${USER}"
                    echo "${PWD}"
                }
            }
        }

    }
}