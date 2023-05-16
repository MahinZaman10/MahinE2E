package smarttech.ny.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Runner Class we write the codes after the package the before the Class!

@CucumberOptions( // Anotation //API- Aplication Proggaming Interface - JAR file
		plugin = {"pretty","json:target/cucumber.json" }, // -->//Plugin - Generates the Report.
		features = { ".//Features/" }, // --> Feature is nothing but a location of features file
		glue = { "smarttech.ny.stepdefinations","smarttech.ny.hooks"} // glue is nothing but location of StepDefination
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
