//Create an ArrayList of fruits. Add five fruits and print them using a loop
import java.util.ArrayList;
import java.util.List;

public class GroceryListExercise {
    public static void main(String[] args){
        List<String> myGroceries = new ArrayList<>();
        myGroceries.add("Veggies");
        myGroceries.add("Apple");
        myGroceries.add("Pineapple");
        myGroceries.add("melon");
        myGroceries.add("Banana");

        for(String fruits : myGroceries){
            System.out.println(fruits);
        }
        //remove 3rd element and print list
        myGroceries.remove(2);
        System.out.println(myGroceries);
        //method to check if list contains an element
       boolean isKiwiPresent= myGroceries.contains("Kiwi");
       System.out.println("Groceries list contains " +isKiwiPresent);
       //method to update an element
        myGroceries.set(2, "Pear");
        System.out.println(myGroceries);
        System.out.println(myGroceries.size());
    }
}
