package runFailesTC;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class FailTestRunnner {
@Test	
	public void RunFailTestcases() {
		
		 TestNG obj = new TestNG();
		 List<String> List = new ArrayList<String>();
		 List.add("D:\\Trainings & Learnings\\Selenium Project\\Selenium Local repo\\SeleniumTutorial\\test-output\\testng-failed.xml");
		 obj.setTestSuites(List);
		 obj.run();
		 
	
	}
	
}
