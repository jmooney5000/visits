def buildApp() {
                echo '>>>>>> executing yarn ..........'
                nodejs('NodeJS 17.9.0') {
                    sh 'yarn install'
                }
}

def testApp() {
    echo 'testing the application'
}

return this