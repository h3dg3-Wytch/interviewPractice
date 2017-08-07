package LinkedLists;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class PalindromeNumber {

    private static Set<Integer> currentlyInSet = new HashSet<>();
    public static boolean isPalindrome(int x) {

        int floor = (int)(Math.log10(x)+1);

       for(int i = 0; i < floor; i++){

          int number = x % 10;
           x /= 10;

           if(currentlyInSet.contains(number)){
               currentlyInSet.remove(number);
           }else{
               currentlyInSet.add(number);
           }
       }

       return currentlyInSet.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
