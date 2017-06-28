package InterviewCake;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rex on 6/22/17.
 */
public class ProblemFive {

    private Map<String, Integer> memo = new HashMap<String, Integer>();

    public static int countDenominations(int coin){

        if(coin == 1){
            return 1;
        }else if (coin <= 0){
            return 0;
        }else{
            return countDenominations(coin - 1) + countDenominations(coin - 2) + countDenominations(coin - 3);
        }

    }

    public static void denominations(int coin) {
        int numberOfSplits = countDenominations(coin);

        int[] coins = new int[]{1, 2, 3};

        for(int i = 0; i < numberOfSplits; i++){
            for(int j = 0 ; j < numberOfSplits;j++){
                
            }
        }
    }


    public int countPossibilitiesTopDown(int amountLeft, int[] denominations ){
        return countPossibilitiesTopDown(amountLeft, denominations, 0);
    }

    private int countPossibilitiesTopDown(int amountLeft, int[] denominations, int index ){

        String memoKey = amountLeft + ", " + index;
        if(memo.containsKey(memoKey)){
            System.out.println("grabbing memo [" + memoKey + "]");
            return memo.get(memoKey);
        }


        if(amountLeft == 0){
            return 1;
        }

        if(amountLeft < 0){
            return 0;
        }

        if(index == denominations.length){
            return 0;
        }

        System.out.println(String.format("checking ways to make %d with %s",
                amountLeft, Arrays.toString(Arrays.copyOfRange(denominations,
                        index, denominations.length))));

        int currentCoin = denominations[index];

        int numPossibilites = 0;
        while(amountLeft >= 0){
            numPossibilites += countPossibilitiesTopDown(amountLeft, denominations, index + 1);
            amountLeft -= currentCoin;
        }

        memo.put(memoKey, numPossibilites);
        return numPossibilites;
    }

    public static void main(String[] args) {


        int[] denoms = new int[]{1,2,3};
        System.out.println(new ProblemFive().countPossibilitiesTopDown(4, denoms));
    }
}
