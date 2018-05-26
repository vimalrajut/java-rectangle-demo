pipeline
 agent any
 stages{
   stage('test')
  	{
	 step{
	echo "Runnning the Test Stage"
	sh 'ant -f test.xml -v'
	junit 'reports/result.xml'
	eho "exiting the test stage"
	}
	}
   stage('build')
	{
	  step{
		echo "this is the build stage"
		sh 'ant -f build.xml -v'
		echo "build completed"
		}
	}
	}
		
