package bonusexercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args){
        List<String> list = Arrays.asList("apple", "banana","apple","orange","banana", "apple");
        //map to store frequencies
        Map<String,Integer> frequencyMap = new HashMap<>();
        //count frequencies
        for(String item:list){
            frequencyMap.put(item, frequencyMap.getOrDefault(item,0)+1);
        }
        //print results
        for(Map.Entry<String,Integer>entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
