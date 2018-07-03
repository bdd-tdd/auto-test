package com.testdemo.todos.features.steps;

import com.testdemo.todos.steps.User;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class RecordTodoSteps {
	@Steps
	User user;
	
	@Given("^users can add an action \"([^\"]*)\" to the todo list$")
	public void add_action_to_todo_list(String action) throws Throwable {
		user.open_todo_application();
		user.add_an_action_Called(action);
		user.should_see_action_called(action);
	}
}