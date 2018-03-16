
package todolist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @author Pradeep
 */
public class AddTask {

    public AddTask() {
    }

    public void showDisplay(ArrayList<Task> tasks) {
        Task newTask = new Task();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Task: ");
            newTask.setName(br.readLine());
            System.out.print("Enter Project: ");
            newTask.setProject(br.readLine());
            System.out.print("Enter Due date <ddmmyyyy>: ");
            String inputDate = br.readLine();
            DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
            newTask.setDueDate(dateFormat.parse(inputDate));
            boolean flag = true;
            do{
                System.out.print("Enter Status: ");
                String status = br.readLine();
                switch(status.toUpperCase()){
                    case "NEW": newTask.setStatus(Status.NEW);
                                flag = false;
                                break;
                    case "INPROGRESS": newTask.setStatus(Status.INPROGRESS);
                                    flag = false;
                                    break;
                    case "COMPLETED": newTask.setStatus(Status.COMPLETED);
                                    flag = false;
                                    break;
                    default:
                        System.out.println("Please enter either NEW, INPROGRESS or COMPLETED.");
                }
            } while(flag);
            tasks.add(newTask);
        } catch (ParseException|IOException e){
            System.out.println(e.getMessage());
        }
       
    }

    public void showMenu() {

    }
}
