
package todolist;

import java.util.ArrayList;

/**
 * @author Pradeep
 */
public class ShowTask {

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

    public void showMenu() {

    }
    
}
