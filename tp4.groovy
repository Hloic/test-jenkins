node {
    stage('First'){
        print "hello ADEO"
        sh 'env'
    }
    
    stage('second'){
        print 'Deuxieme partie de la formation'
    }
}
