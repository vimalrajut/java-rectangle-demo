pipeline
 agent any
 stages{
   stage('test')
  	{
	 steps{
	echo "Runnning the Test Stage"
	sh 'ant -f test.xml -v'
	junit 'reports/result.xml'
	echo "exiting the test stage"
	}
	}
   stage('build')
	{
	  steps{
		echo "this is the build stage"
		sh 'ant -f build.xml -v'
		echo "build completed"
		}
	}
	}
		
