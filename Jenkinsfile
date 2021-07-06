node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarScanner for MSBuild'
    withDotNet('SDK') {
      withSonarQubeEnv() {
        sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll begin /k:\"Jenkins\""
        sh "dotnet build"
        sh "dotnet ${scannerHome}/SonarScanner.MSBuild.dll end"
      }
    }
  }
}
