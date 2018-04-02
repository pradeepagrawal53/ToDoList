
package se.kth.sda3.todolist.filehandler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import se.kth.sda3.todolist.model.Task;

/**
 * The class for saving data to a file.
 */
public class File<T> {
    
    private final String filename;
    
    /**
     * Creates a new instance
     * @param filename The filename of the file the data will be written to.
     */
    public File(String filename){
        this.filename = filename;
    }
    
    public void writeFile(List <T> tasks){
        
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter(filename));
            
            for (Task task:(List<Task>) tasks) {
                outputStream.format(task.getName(), task.getProject(),
                                    task.getDueDate(), task.getStatus());
            }
        } catch(IOException e) {
            System.out.println("e.getMessage()");
        }
    }
    
    
            
    
}
