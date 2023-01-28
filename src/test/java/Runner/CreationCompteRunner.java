package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = "src/test/resources/features",
		
		glue ="carambarStepDefinition",
		tags = "@creationCompteCarambar",
		monochrome=true,
		dryRun=false,
		
		plugin = { "pretty" ,"html:target/cucumber-report.html"}

		
		)

public class CreationCompteRunner {

}
