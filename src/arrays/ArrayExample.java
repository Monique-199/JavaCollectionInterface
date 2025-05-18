package arrays;

public class ArrayExample {
    public static void main(String[] args){
        //initializing the array
        int[] numbers = new int[5];
        //adding elements to the array
        numbers[0]= 20;
        numbers[1] = 30;
        numbers[2]= 40;
        numbers[3]= 50;
        numbers[4]= 60;
        //printing the array
        System.out.println("Here are the array elements");
        for(int i=0; i<numbers.length; i++){
            System.out.println("Index " +i+ ":" + numbers[i]);
        }

    }
}
