package InterviewCake;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3dg3wytch on 7/30/17.
 */
public class MoreRecursion {

    private static  Map<String, Integer> memoMap = new HashMap<>();

    public static void main(String[] args) {

        int[] denoms = {1, 2, 3};
        System.out.println(countCoins(4,0, denoms ));

    }

    public static int countCoins(int amountLeft, int currentIndex, int[] denominations ){

        String memoKey = amountLeft + ", " + denominations;
        if(memoMap.containsKey(memoKey)){
            System.out.println("grabbing memo [" + memoKey + "]");
            return memoMap.get(memoKey);
        }

        if(amountLeft == 0){
            return 1;
        }

        if( amountLeft < 0){
            return 0;
        }

        if( currentIndex == denominations.length){
            return 0;
        }

        int currentDenomination = denominations[currentIndex];
        int numOfPossibilites = 0;
        while(amountLeft >= 0){
            numOfPossibilites += countCoins(amountLeft, currentIndex + 1, denominations );
            amountLeft -= currentDenomination;
        }

        memoMap.put(memoKey, numOfPossibilites);

        return numOfPossibilites;

    }
}
