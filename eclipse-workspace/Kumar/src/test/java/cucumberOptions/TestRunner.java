package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/featureFiles/watch.feature",
		glue= {"stepDefs"}
		//format= {"pretty", "html:test-output"}
		
		)

public class TestRunner {

}
