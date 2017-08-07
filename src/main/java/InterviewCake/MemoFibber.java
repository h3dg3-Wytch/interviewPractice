package InterviewCake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3dg3wytch on 7/25/17.
 */
public class MemoFibber {

    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(MemoFibber.fib(8));

    }

    public static int fib(int n){
        if( n == 1 || n == 0){
            return n;
        }

        if(memo.containsKey(n)){
            System.out.printf("Grabbing memo [%d]\n", n);
            return memo.get(n);
        }

        int result = fib(n - 1) + fib(n -2 );
        System.out.printf("Calculating result for n : %d\n", n);
        memo.put(n, result);
        return result;
    }


}
