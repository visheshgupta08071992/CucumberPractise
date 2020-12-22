package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {
	@Given("User is on Login Page")
	public void userIsOnLoginPage() {
	}

	@When("User enters username {string}")
	public void userEntersUsername(String UserName) {
		System.out.println("Username entered is " + UserName );
	}

	@And("User enters password {string}")
	public void userEntersPassword(String password) {
		System.out.println("Password entered is " + password);
	}

	@Then("Error message should be displayed")
	public void errorMessageShouldBeDisplayed() {
	}
}
