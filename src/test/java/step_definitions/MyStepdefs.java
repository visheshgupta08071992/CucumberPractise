package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
	@Given("Search box is available on Amazon")
	public void searchBoxIsAvailableOnAmazon() {
		System.out.println("Search Box is available on Amazon");
	}

	@When("I search a product named {string} and price is {int}")
	public void iSearchAProductNamedAppleMacbookAndPriceIs(String product,int price) {
		System.out.println("Searched product " + product + "having price " + price);
	}

	@Then("Product with Name {string} should be displayed")
	public void productWithNameAppleMacbookShouldBeDisplayed(String product) {
		System.out.println(product + "is displayed");
	}
}
