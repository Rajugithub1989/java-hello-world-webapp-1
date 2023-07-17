#!groovy

// // def firstTest(){

// //     stage('build repo 1') {
// //         try{
            
// //             checkout([
// //                     $class: 'GitSCM',
// //                     //poll: true,
// //                     branches: [[name: 'master']],
// //                     userRemoteConfigs: [[url: 'https://github.com/Rajugithub1989/java-hello-world-webapp-1.git', credentialsId: 'Multiple-repos-commits-with-one-pipeline']]
                    
// //                 ])
// //         }catch(err){
// //             echo "Stage : '${env.STAGE_NAME}' Failed : "+err.toString()
// //             throw err
// //         }
// //    }
// //     //}

// //     stage('Cleanup workspace'){
// // deleteDir()
// // }
// // }


def get_project_code(repo_url){
    project_codes = [
        "https://github.com/Rajugithub1989/java-hello-world-webapp-1.git": '**Rboss9743483266**',
        "https://github.com/Rajugithub1989/java-hello-world-webapp-2.git": '**Rboss9743483266**',
        "https://github.com/Rajugithub1989/java-hello-world-webapp-3.git": '**Rboss9743483266**'
    ]
    return project_codes[repo_url]
}
return this
