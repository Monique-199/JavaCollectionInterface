package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ReceiptPrintingQueue {
    public static void main(String[] args) {
        Queue<PrintJob> printQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int receiptCounter = 1000;
        System.out.println("Receipt printing started");
        System.out.println("All receipts go to the default printing queue");

        while(true){
            System.out.println("1. Send receipts to the printer");
            System.out.println("2. Process next print job");
            System.out.println("3. View print queue");
            System.out.println("4. Exit");
            System.out.print(" Enter your choice");

            int choice = Integer.parseInt(scanner.nextLine().trim());


            switch(choice){
                case 1:
                    //Add a new print job to the queue
                    System.out.println("Enter user name: ");
                    String user = scanner.nextLine();
                    String receiptId= "RCPT_ "+receiptCounter++;
                    printQueue.offer(new PrintJob(user, receiptId));
                    System.out.println("✅ Receipt " + receiptId + " added to print queue by " + user);
                    break;

                case 2:
                    // Process (print) the next receipt
                    if (!printQueue.isEmpty()) {
                        PrintJob job = printQueue.poll(); // remove from front
                        System.out.println("\n🖨️ Printing Receipt...");
                        System.out.println(job); // display job details
                        System.out.println("✅ Printed Successfully!\n");
                    } else {
                        System.out.println("⚠️ Print queue is empty!\n");
                    }
                    break;
                case 3:
                    // View current print queue
                    System.out.println("\n📋 Current Print Queue:");
                    if (printQueue.isEmpty()) {
                        System.out.println("📭 No jobs in the queue.\n");
                    } else {
                        for (PrintJob job : printQueue) {
                            System.out.println("🔸 " + job);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("👋 Exiting Printer System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Invalid choice. Try again.\n");
            }
        }
    }
}
