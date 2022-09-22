def sonarAnalysis(key,name,url,login){
      sh 'mvn sonar:sonar \
        -Dsonar.projectKey=${key}	 \
        -Dsonar.projectName=${name} \
        -Dsonar.host.url=${url} \
        -Dsonar.login=${login}'
}
//spring,spring,http://20.244.33.251:9000,9fe0b448d589e6dde9f405e50ed8448f012f09f5
