Feature: Add new todos
Users need to be able to quickly add tasks as fast as they can think of them.

Scenario: Add a new todo
    Given the todo application
    When  the todo action "Digitize Supreme Power Collection" is added
    Then  "Digitize Supreme Power Collection" should appear in the todo list
