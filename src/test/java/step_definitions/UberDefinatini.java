package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberDefinatini {
	@When("I book a cab of type {string}")
	public void iBookACabOfTypeSedan(String carType) {
		System.out.println("Booking " + carType);
	}

	@Then("Cab of type {string} arrives")
	public void cabOfTypeSedanArrives(String carType) {
		System.out.println("Car " + carType + " arrives");
	}

	@And("driver starts the journey")
	public void driverStartsTheJourney() {
	}

	@And("driver completes the journey")
	public void driverCompletesTheJourney() {
	}

	@Then("^I pay (\\d+) USD$")
	public void iPayUSD(int price) {
		System.out.println("Paid USD " + price);
	}
}
