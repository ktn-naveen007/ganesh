node('master'){
def artifactName = null
stage('initialize'){
checkout scm
}
stage('compile'){
 bat '''
mvn compile
'''
}
stage('unittest'){
bat '''
mvn test
'''
}
stage('packaging'){
bat '''
mvn package
'''
artifactName = bat(script:'@dir target\\*.jar /b',returnStdout: true).trim()
}
stage("uploading ${artifactName}"){
    bat """
	    rmdir /s /q e:\\naveen_jenkins
        mkdir e:\\naveen_jenkins
        copy target\\${artifactName} e:\\naveen_jenkins 
    """
}
stage('deploy'){
    withCredentials([usernamePassword(credentialsId: '1d665af0-8baf-4317-8452-51ebfe264136', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
    bat """
    
    cf login --skip-ssl-validation -a https://api.run.pivotal.io/ -u %USERNAME% -p %PASSWORD% -o DevOps_007 -s development
    cf push ganesh -p target\\${artifactName} -f manifest.yml -n ganesh-devops-007 -d apps.internal
    cf logout
    """
    }
}
}