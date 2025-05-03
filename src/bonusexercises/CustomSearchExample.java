package bonusexercises;

import java.util.ArrayList;

public class CustomSearchExample {
    public static void main(String[] args){
        ArrayList<String> listNames= new ArrayList<>();
        listNames.add("Amanda");
        listNames.add("Charles");
        listNames.add("Alex");
        listNames.add("Andrew");
        System.out.println("Students whose names start with A:");
        for(String names : listNames){
            if(names.toLowerCase().startsWith("a")){
                System.out.println(names);
            }
        }
    }
}
