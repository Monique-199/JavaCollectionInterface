import java.util.ArrayList;
import java.util.List;

public class GroceryListExample {
    public static void main(String[] args){
        List<String> groceries = new ArrayList<>();
        groceries.add("Milk");
        groceries.add("Bread");
        groceries.add("Eggs");
        groceries.add("Eggs");//duplicates are allowed
        //print the items
        System.out.println("Groceries"+groceries);
        //Access by index
        System.out.println("First item: " +groceries.getFirst());
        System.out.println("First item :"+groceries.get(0));
        //remove item by index
        groceries.remove(2);
        System.out.println("Groceries after removing eggs"+groceries);

        //check if list contains something
        if(groceries.contains("Bread")){
            System.out.println("Don't forget bread");
        }

        //loop through the list
        System.out.println("Items to buy:");
        for(String item :groceries){
            System.out.println("- "+item);
        }
//        size of the list
        System.out.println("Total items:"+groceries.size());
    }
}
