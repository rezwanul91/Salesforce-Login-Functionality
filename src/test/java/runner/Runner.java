package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\customer\\"},
		glue = {"step_definitions"},
		tags = {},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
)
public class Runner {

}

//Test Automation Framework
//with Cucumber BDD and Page Object Model

