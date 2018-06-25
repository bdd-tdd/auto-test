@AddNewTodos
Feature: Add new todos
Users need to be able to add tasks.

@ShouldPass
Scenario: Add a new todo
    Given the todo application
    When  the todo action "Learn AngularJS" is added
    Then  "Learn AngularJS" should appear in the todo list

@ShouldFail
Scenario: Add a new todo
    Given the todo application
    When  the todo action "Code AngularJS" is added
    Then  "Code Angular JS" should appear in the todo list