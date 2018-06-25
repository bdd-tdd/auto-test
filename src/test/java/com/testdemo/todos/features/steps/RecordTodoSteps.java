package com.testdemo.todos.features.steps;

import com.testdemo.todos.steps.User;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RecordTodoSteps {
	@Steps
	User user;
			
	@Given("^the todo application$")
	public void start_the_todo_applications() {
		user.open_todo_application();	
	}
	
	@When("^the todo action \"([^\"]*)\" is added$")
    public void add_a_todo_action(String actionName) {
		user.add_an_action_Called(actionName);
	}
	
	@Then("^\"([^\"]*)\" should appear in the todo list$")
	public void action_should_appear_in_the_todo_list(String action) {
		user.should_see_action_called(action);
	}
}