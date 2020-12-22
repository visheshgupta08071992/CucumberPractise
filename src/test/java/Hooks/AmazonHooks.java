package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before(order=2)
	public void setup_url(Scenario sc) {
		System.out.println("Setting up URL for Scenario " + sc.getName());
	}

	@Before(order=1)
	public void setup_browser(Scenario sc) {
		System.out.println("Setting up browser for Scenario " + sc.getName());
	}

	@After
	public void Teardown_browser(Scenario sc) {
		System.out.println("Closing browser for Scenario " + sc.getName());
	}

	@BeforeStep
	public void takeScreenshot(){
		System.out.println("Take a Screenshot");
	}

	@AfterStep
	public void refresh(){
		System.out.println("Refrshing the Page");
	}
}
