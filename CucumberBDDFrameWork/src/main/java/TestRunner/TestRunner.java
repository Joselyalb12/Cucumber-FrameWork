package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\Josel\\Desktop\\Automation Documents\\CucumberBDDFrameWork\\src\\main\\java\\Feature\\login.feature",
		glue = {"StepDefinition"},
		plugin= {"pretty", "html:test-output"},
		dryRun = false 
		
		)




public class TestRunner {

}
