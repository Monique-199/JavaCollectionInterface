package linkedhashset;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FruitCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        System.out.println("Enter name of fruits one by one ");
        System.out.println("type done when you're finished.\n");
        while(true){
            System.out.print("Enter a fruit: ");
            String fruit = scanner.nextLine().trim();

            if (fruit.equalsIgnoreCase("done")) {
                break;
        }
            if (fruit.isEmpty()) {
                System.out.println("⚠️ You entered nothing! Try again.");
                continue;
            }
            if (fruits.contains(fruit)) {
                System.out.println("⚠️ You already added " + fruit + "! Skipping.");
            } else {
                fruits.add(fruit);
                System.out.println("✅ Added: " + fruit);
            }
        }
        System.out.println("\n🍇 Unique fruits you entered, in order:");
        for (String f : fruits) {
            System.out.println("👉 " + f);
        }

        scanner.close();

    }
}
