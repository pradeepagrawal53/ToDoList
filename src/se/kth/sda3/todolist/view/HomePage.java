package se.kth.sda3.todolist.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The view for applications home page.
 */
public class HomePage {
    
    //creates an instance of HomePage.
    public HomePage() {
    }

    // Prints the applications home page heading.
    public int homePage(){

        int value = 0;
        System.out.println();
        System.out.println("WELCOME TO MY TO-DO LIST");
        System.out.println("Select an option");
        System.out.println();
       
        value = homeMenu();
        
        return value;
    }

    // Prints the possible options on same home page.
    public int homeMenu(){

        int value = 0;
        String status = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("1. Add Task");
                System.out.println("2. Show Task");
                System.out.println("3. Edit Task");
                System.out.println("4. Exit");
                System.out.println();
                status = br.readLine();
                
                switch(status){
                    case "1":   value = 1;
                                break;
                    case "2":   value = 2;
                                break;
                    case "3":   value = 3;
                                break;
                    case "4":   value = 4;
                                break;
                    default:
                            System.out.println("Please enter numbers from 1 - 4");
                }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        return value;
    }
    
}