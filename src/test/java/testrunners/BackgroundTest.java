package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Background.feature"},
		glue = {"step_definitions"},
		plugin={"pretty"}
)
public class BackgroundTest {
}
