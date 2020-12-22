package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Search.feature"},
		glue = {"step_definitions","Hooks"},
		plugin={"pretty",
				"json:target/MyReports/Report.json",
				"junit:target/MyReports/Report.xml"},
		publish = true
)
public class AmazonTest {
}
