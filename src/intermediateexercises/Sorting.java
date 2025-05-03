package intermediateexercises;

import java.util.*;


public class Sorting {
    public static void main(String[] args){
        ArrayList<Integer> numbers= new ArrayList<>(Arrays.asList(45,34,67,12,909,473,2784,564,234));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(67,32,98,712,452,564,971,190,206));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jace", "Acelyn", "Kate", "Elizabeth", "Mikel", "Edith","Jace", "Kate"));

        //numbers.sort(null);
        //numbers.sort(Comparator.reverseOrder());
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        int max = Collections.max(numbers);
        System.out.println("Max is :"+ max);

        int min = Collections.min(numbers);
        System.out.println("Min is :"+ min);

        String minName = Collections.min(names);
        String maxName = Collections.max(names);

        System.out.println("Alphabetically first : "+minName);
        System.out.println("Alphabetically last : "+maxName);

        names.sort(Comparator.comparing(String::length));
        System.out.println(names);

        //reversing using set convert the List to HashSet
        HashSet<String> uniqueList = new HashSet<>(names);
        System.out.println("Unique names:");
        for(String item : uniqueList){
            System.out.println(item);
        }
        //using LinkedHashSet to preserve order
        LinkedHashSet<String> orderedNames = new LinkedHashSet<>(names);
        System.out.println("The ordered names without duplicates:"+orderedNames);
        //merge the integer arraylist
        numbers.addAll(numbers2);
        System.out.println("Merged List: " + numbers);
        Set<Integer> set = new LinkedHashSet<>(numbers);
        ArrayList<Integer> noDuplicates = new ArrayList<>(set);
        System.out.println("No duplicates values"+noDuplicates);





    }
}
