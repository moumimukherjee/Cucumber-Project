package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToDoListSteps {

	@Given("User login into Task page")
	public void user_login_into_Task_page() {
		System.out.println("User in Application Page");
	}

	@When("Task box is visible")
	public void task_box_is_visible() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@And("click to Add")
	public void click_to_Add() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("List of Task added")
	public void list_of_Task_added() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


}
