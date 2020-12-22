package step_definitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationDefinition {
	@Given("User is on Registration Page")
	public void userIsOnRegistrationPage() {
	}

	@When("User enters following Data")
	public void userEntersFollowingData(DataTable dataTable) {
		List<List<String>> userList=dataTable.asLists();
		for (List<String> user:userList){
			System.out.println(user);

		}
	}

	@When("User enters following Data with columns")
	public void userEntersFollowingDataWithColumns(DataTable dataTable) {
		List<Map<String, String>> userListWithMap=dataTable.asMaps();
		for(Map<String, String> user:userListWithMap){
			System.out.println(user);
			System.out.println(user.get("firstName"));
			System.out.println(user.get("emailAddress"));
		}

		}

	@Then("Registration is successful")
	public void registrationIsSuccessful() {
	}
}
