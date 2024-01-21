import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{
    private ArrayList<String> tasks;

    public ToDoList(){
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
        System.out.println("Task added: "+ task);
    }

    public void removeTask(int index){
        if ( index >= 0 && index < tasks.size()){
            String removeTask = tasks.remove(index);
            System.out.println("Task removed: "+ removeTask);
        } else {
            System.out.println("Invalid index.");
        }
    }
 
    public void displayTasks(){
        if ( tasks.isEmpty()){
            System.out.println("No tasks in the to-do list.");
        }else{
            System.out.println("Tasks in the to-do list: ");
            for ( int i = 0; i<tasks.size(); i++){
                System.out.println((i + 1) + ". "+ tasks.get(i));
            }
        }
    }
    public static void main(String[] args){

        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while ( choice != 4){
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index-1);
                    scanner.nextLine();
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }
        scanner.close();

    }
}