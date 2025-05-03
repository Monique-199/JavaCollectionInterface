import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println(" Welcome to your To-Do List!");

        do{
            System.out.println("\nChoose an option");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1-4): ");
            choice=scanner.nextInt();

            switch (choice){
                case  1:
                    System.out.println("Enter the task to add");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("task added");
                    break;

                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("List is empty");
                    }else {
                        System.out.println("Your tasks :");
                        for(int i=0; i<tasks.size(); i++){
                            System.out.println((i+1)+ " ."+tasks.get(i));

                        }
                    }
                    break;
                case 3:
                    if(tasks.isEmpty()){
                        System.out.println("No tasks to remove.");

                    }else{
                        System.out.println("Which task do you want to remove?");
                        for(int i= 0; i< tasks.size(); i++){
                            System.out.println((i+1) + ". " +tasks.get(i));

                        }
                        System.out.print("Enter task number");
                        int taskNumber = scanner.nextInt();
                        if(taskNumber >=1 && taskNumber<=tasks.size()){
                            String removed = tasks.remove(taskNumber-1);
                            System.out.println("Removed task: " + removed);

                        }else{
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Have a productive day!");
                    break;

                default:
                    System.out.println(" Please enter a valid option (1-4).");

            }

        }while(choice!=4);
        scanner.close();

        }
    }

