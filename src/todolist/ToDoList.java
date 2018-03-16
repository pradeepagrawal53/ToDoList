
package todolist;

import java.util.ArrayList;

/**
 * @author Pradeep
 */
public class ToDoList {
    
    private ArrayList<Task> tasks;
    private AddTask addTask;
    private HomePage homePage;
    private ShowTask showTask;

    public ToDoList() {

        tasks = new ArrayList<>();
        homePage = new HomePage();
        addTask = new AddTask();
        showTask = new ShowTask();
    }
    
    public void showView(){
        boolean flag = true;
        do{
            int value = 0;
            value = homePage.homePage();
            switch(value){
                case 1:     showTask.showDisplay(tasks);
                            flag = true;
                            break;
                case 2:     addTask.showDisplay(tasks);
                            flag = true;
                            break;
                default:    flag = false;
                            break;
            }
        } while(flag);
    }
    
}
