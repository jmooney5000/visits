def buildApp() {
    echo '>>>>>> executing yarn ..........'
    nodejs('NodeJS 17.9.0') {
        sh 'yarn install'
    }
}

def testApp() {
    echo 'testing the application of all bananas.....'
    echo "building version ${NEW_VERSION}"
    echo "my-pipeline-git-credentials ${SERVER_CREDENTIALS}"
}

def deployApp() {
    echo 'deploying the application...'
    withCredentials([
        usernamePassword(credentialsId: 'my-pipeline-git-credentials', usernameVariable: 'USER', passwordVariable: 'PWD')
    ]) {
        echo "username password: ${USER}"
        echo "${PWD}"
    }
}

return this