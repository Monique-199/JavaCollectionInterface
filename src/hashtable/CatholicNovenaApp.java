package hashtable;

import java.util.Hashtable;

public class CatholicNovenaApp {
    public static void main(String[] args) {
        //1. create a hashtable Key = Day, Value = Petition/Intention
        Hashtable<String,String> novenaHashTable = new Hashtable<>();
        //2. Add entries (like assigning intentions to each day)
        novenaHashTable.put("Day1","Petition for Strength");
        novenaHashTable.put("Day2","Petition for Guidance");
        novenaHashTable.put("Day3", "Thanksgiving");
        novenaHashTable.put("Day4", "Career growth");
        novenaHashTable.put("Day5", "Petition for good health");
        novenaHashTable.put("Day6", "Prayer for family");
        novenaHashTable.put("Day7", "Peace");
        novenaHashTable.put("Day8", "Happiness");
        novenaHashTable.put("Day9", "Financial freedom");
        // 3. Retrieve a novena petition 
        String petition= novenaHashTable.get("Day1");
        System.out.println("Novena for day 1 is: "+petition);
        //4. update a petition
        novenaHashTable.put("Day3","Prayer for all the unemployed");
        System.out.println("Updated day 3: "+novenaHashTable.get("Day3"));
        //5.Remove a day
        novenaHashTable.remove("Day4");
        System.out.println("Is Day4 still here? "+novenaHashTable.get("Day4"));
        // 6. loop through
        for(String day:novenaHashTable.keySet()){
            System.out.println(day +"->" +novenaHashTable.get(day));
        }

    }
}
