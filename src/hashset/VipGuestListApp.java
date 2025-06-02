package hashset;
import java.util.Scanner;
import java.util.HashSet;
//1. Create a HashSet to store guest names.
//2. Show a menu with options:
//        - Add a guest
//    - Remove a guest
//    - View guest list
//    - Check if someone is invited
//    - Clear the list
//    - Exit
//3. Perform the selected action.
//4. Repeat until the user chooses to exit.


public class VipGuestListApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashSet<String> guestList = new HashSet<>();
        String guest;
        int choice;

        System.out.println("Welcome to the Vip Guest List app");
        do{
            System.out.println("\n Choose an option:");
            System.out.println("1. Add a guest");
            System.out.println("2. Remove a guest");
            System.out.println("3. View guest list");
            System.out.println("4. Check if someone is invited");
            System.out.println("5. Clear the guest list");
            System.out.println("6. Exit");
            System.out.print("Enter choice (1-6):");
            choice= scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            switch(choice){
                case 1:
                    System.out.println("Enter guest name to add :");
                    guest= scanner.nextLine();
                    if(guestList.add(guest)){
                        System.out.println(guest + " added to the list");
                    }else{
                        System.out.println(guest + "is aleady in the list");
                    }
                    break;

                case 2:
                    System.out.println("Enter guest name to remove :" );
                    guest=scanner.nextLine();
                    if(guestList.remove(guest)){
                        System.out.println(guest + " removed from the list");
                    }else{
                        System.out.println(guest + " was not found in list");
                    }
                    break;

                case 3:
                    System.out.println("Guest list : " );
                    if(guestList.isEmpty()){
                        System.out.println("No guests yet :");
                    }else{
                        for(String g : guestList){
                            System.out.println("-" + g);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter guest to check : ");
                    guest= scanner.nextLine();
                    if(guestList.contains(guest)){
                        System.out.println(guest + "is invited!");
                    } else{
                        System.out.println(guest + "is not on the list");
                    }
                    break;
                case 5:
                    guestList.clear();
                    System.out.println("The guest list has been cleared");
                    break;
                case 6:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-6 ");
                    }

            }while(choice!=6);
            scanner.close();

    }
}
