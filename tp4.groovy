node {
    stage('First'){
        print "hello ADEO"
        sh 'env'
    }
    
    stage('second'){
        print 'Deuxieme partie de la formation'
    }
    
    stage ('print variable'){
        print "build number: $BUILD_NUMBER" 
    }
}
