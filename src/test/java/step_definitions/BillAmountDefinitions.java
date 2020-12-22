package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillAmountDefinitions {
	Double billAmount;
	Double taxAmount;
	Double totalAmount;
	@Given("User gets the bill")
	public void userGetsTheBill() {
	}

	@When("Bill amount is {string}")
	public void billAmountIsBillAmount(String billAmount) {
		this.billAmount=Double.parseDouble(billAmount);
	}

	@And("Tax amount is {string}")
	public void taxAmountIsTaxAmount(String taxAmount) {
		this.taxAmount=Double.parseDouble(taxAmount);
	}

	@Then("Total amount is {string}")
	public void totalAmountIsTotalAmount(String totalAmount) {
		this.totalAmount=billAmount+taxAmount;
		Assert.assertTrue(this.totalAmount==Double.parseDouble(totalAmount));
	}
}
