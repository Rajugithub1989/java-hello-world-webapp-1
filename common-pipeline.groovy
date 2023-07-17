#!groovy

def firstTest(){

  node('test-node'){

    stage('build repo 1'){    
      echo "Building Repo 1"
         steps {
             dir('java-hello-world-webapp-1') {
                 checkout([$class: 'GitSCM',
                           branches: [[name: 'master']],
                           userRemoteConfigs: [[credentialsId: 'Multiple-repos-commits-with-one-pipeline',
                                                url: 'https://github.com/Rajugithub1989/java-hello-world-webapp-1.git']]])

                     sh 'mvn clean test -PrunIndividualSuite -DsuiteXmlFile=Functional.xml -Denv=qa'

                 }
             }
         }
    }

    stage('Cleanup workspace'){
deleteDir()
}
}
return this




// def test1(){
//     git clone https://github.com/Rajugithub1989/java-hello-world-webapp-1.git
// }
// def test2(){
//     git clone https://github.com/Rajugithub1989/java-hello-world-webapp-2.git
// }
// //def test3(){
// //    git clone https://github.com/Rajugithub1989/java-hello-world-webapp-3.git
// //}
// return this










// { 
//     node() {
//        git clone https://github.com/Rajugithub1989/java-hello-world-webapp-1.git
//        git clone https://github.com/Rajugithub1989/java-hello-world-webapp-2.git
//        git clone https://github.com/Rajugithub1989/java-hello-world-webapp-3.git            

//        // Whatever you do with your 3 repos...
//     }
// }