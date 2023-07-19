pipeline 
{
    agent any

    stages {
        stage('Display welcome message on console') {
            steps {
            sh "echo Hi"
            }
        }
        stage('Cloning Calculator API repository') {
            steps {
                script  {
                    FAILED_Stage=env.STAGE_NAME
               }
               git branch : 'main', credentialsId: 'apitokencred', url: 'https://github.com/deegbo/jenkins.git'
            }
        }
    
      stage('Deploying CalculatorAPI on Nexus Repository') 
      {
           steps 
           {
              withMaven 
             {
              //sh "mvn clean package"
              sh "mvn deploy"
             }
           }
      }
      stage('Display good bye message on console')
      {
          steps{
         sh 'echo Good Bye'
          }
      }
    }
    
    post
    {
          success
          {
            sh 'echo Both stages are successful'
          }
          failure
          {
            emailext body: "Stage: ${FAILED_Stage} from Build: ${BUILD_NUMBER} of ${JOB_NAME} failed.  details: ${DEFAULT_SUBJECT}",
            subject: "${DEFAULT_SUBJECT}  ${env.JOB_NAME}",
            to: 'just_9@hotmail.com'
          }
    }
}   
