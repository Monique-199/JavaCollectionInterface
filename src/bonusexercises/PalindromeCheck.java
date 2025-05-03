package bonusexercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(45, 34, 29, 12, 42, 84, 70, 28));
        if (isPalindrome(numbers)) {
            System.out.println("The list is a palindrome");
        } else {
            System.out.println("The list is not palindrome");

        }
    }
        public static boolean isPalindrome (ArrayList < Integer > numbers) {
            int left = 0;
            int right = numbers.size() - 1;
            while (left < right) {
                if (!numbers.get(left).equals(numbers.get(right))) {
                    return false;
                }
                left++;
                right--;

            }
            return true;

        }
    }

