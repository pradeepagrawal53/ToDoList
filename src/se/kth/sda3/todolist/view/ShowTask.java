package se.kth.sda3.todolist.view;

import se.kth.sda3.todolist.model.Task;
import java.util.ArrayList;

/**
 * The view for showing the tasks.
 */
public class ShowTask {

    // creates an instance of ShowTask.
    public ShowTask() {
    }

        public void showDisplay(ArrayList<Task> tasks) {
        System.out.println("SHOW TASKS");
        for (Task task: tasks){
            System.out.println(task.getName());
            System.out.println(task.getProject());
            System.out.println(task.getDueDate());
            System.out.println(task.getStatus());
        }

    }
   
}