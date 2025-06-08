package hashmap;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        String sentence ="I love coding so much. I code in java";
        HashMap<Character, Integer> freqCount = new HashMap<>();
        for(char c : sentence.toCharArray()){
            freqCount.put(c, freqCount.getOrDefault(c,0)+1);
        }
        //to ignore spaces and be case sensitive
        //String sentence = "I love java so much, and I love coding.".toLowerCase.replace(" ", "");

        System.out.println(freqCount);
    }
}
