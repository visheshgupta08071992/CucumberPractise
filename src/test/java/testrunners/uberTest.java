package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Uber.feature"},
		glue = {"step_definitions"},
		tags = "@Smoke and @Regression",
		plugin={"pretty"}
)
public class uberTest {
}
