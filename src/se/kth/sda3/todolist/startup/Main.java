package se.kth.sda3.todolist.startup;

import se.kth.sda3.todolist.controller.ToDoList;

/**
 * Contains the main method.
 * Starts the application.
 */
public class Main {
    
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.showView();
        
    }
    
}