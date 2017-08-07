package InterviewCake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3dg3wytch on 7/30/17.
 */
public class FibAgain {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(memoFib(6));
    }

    public static int recursFib(int n){

        if(n == 0 || n == 1){
            return n;
        }

        return fib(n - 1) + fib(n -2);

    }


    public static int memoFib(int n){

        if(memo.containsKey(n)){
            System.out.println("Retrieving from MEMO MAP for " +n );
        }

        if(n == 0 || n == 1){
            return n;
        }

        int result = fib(n - 1) + fib(n -2);
        memo.put(n, result);

        return result;
    }

    public static int fib(int n){
        int result = 0;
        int prev = 0;
        int current = 1;

        for(int i = 1; i < n; i++){

            result = current + prev;
            prev = current;
            current = result;
        }

        return result;
    }


}
