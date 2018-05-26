pipeline{
 agent any
 stages{
   stage('test')
        {
                steps{
         echo "RUnning the test stage"
         sh 'ant -f test.xml -v'
         junit 'reports/result.xml'
         echo "exiting the test stage"
                }
        }
   stage('build')
        {
                steps{
                echo 'THis is my build stage'
                sh 'ant -f build.xml -v'
                echo "build completed"
        }
        }


}

}
