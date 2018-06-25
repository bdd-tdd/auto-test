package com.testdemo.todos.steps;

import com.testdemo.todos.pages.TodoPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

public class User extends ScenarioSteps {
	TodoPage todoPage;
	
	@Step
	public void open_todo_application() {
		todoPage.open();		
	}
	@Step
	public void add_an_action_Called(String actionName) {
		todoPage.addActionCalled(actionName);
	}
	@Step
	public void should_see_action_called(String action) {
		assertThat(todoPage.getActions()).contains(action);		
	}
	
}