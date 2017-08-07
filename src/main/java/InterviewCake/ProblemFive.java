package InterviewCake;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rex on 6/22/17.
 */
public class ProblemFive {

    private static Map<String, Integer> memoMap = new HashMap<>();

    public static void main(String[] args) {
        int[] list = {1 , 3, 5};
        System.out.println(changePossibiltiesBottomUp(5, list));
//        System.out.println(changePossibiltiesTopDown(4, 0, list));
    }


    public static int changePossibiltiesBottomUp(int amount, int[] denominations){

        int[] waysOfDoingNCents = new int[amount + 1];
        waysOfDoingNCents[0] = 1;

        for(int coin : denominations){

            for(int higherAmount = coin; higherAmount <= amount; higherAmount++){

                int remainder = higherAmount - coin;
                waysOfDoingNCents[higherAmount] += waysOfDoingNCents[remainder];
            }
        }

        return waysOfDoingNCents[amount];
    }

//public static int changePossibiltiesBottomUp(int amount, int[] denominations){
//
//    int[] waysOfDoingNCents = new int[amount + 1];
//
//    waysOfDoingNCents[0] = 1;
//
//    for(int coin: denominations){
//
//        for(int higherAmount = coin; higherAmount <= amount; higherAmount++){
//            System.out.println(Arrays.toString(waysOfDoingNCents));
//            int remainder = higherAmount - coin;
//            waysOfDoingNCents[higherAmount] += waysOfDoingNCents[remainder];
//        }
//    }
//
//    return waysOfDoingNCents[amount];
//}


private static int changePossibiltiesTopDown(int amount, int currentIndex, int[] denominations){

    String memoKey = amount + ", " + currentIndex;
    if(memoMap.containsKey(memoKey)){
        System.out.println("Returning " +memoKey);
        return memoMap.get(memoKey);
    }

    if(amount == 0){
        return 1;
    }

    if( amount < 0){
        return 0;
    }

    if(currentIndex == denominations.length){
        return 0;
    }

    int currentCoin = denominations[currentIndex];
    int numberOfPossibilties = 0;
    while(amount >= 0){
        numberOfPossibilties += changePossibiltiesTopDown(amount, currentIndex + 1, denominations);
        amount -= currentCoin;
    }

    memoMap.put(memoKey, numberOfPossibilties);
    return numberOfPossibilties;
}
//    private Map<String, Integer> memo = new HashMap<String, Integer>();
//
//    public static int countDenominations(int coin){
//
//        if(coin == 1){
//            return 1;
//        }else if (coin <= 0){
//            return 0;
//        }else{
//            return countDenominations(coin - 1) + countDenominations(coin - 2) + countDenominations(coin - 3);
//        }
//
//    }
//
//    public static void denominations(int coin) {
//        int numberOfSplits = countDenominations(coin);
//
//        int[] coins = new int[]{1, 2, 3};
//
//        for(int i = 0; i < numberOfSplits; i++){
//            for(int j = 0 ; j < numberOfSplits;j++){
//
//            }
//        }
//    }
//
//
//    public int countPossibilitiesTopDown(int amountLeft, int[] denominations ){
//        return countPossibilitiesTopDown(amountLeft, denominations, 0);
//    }
//
//    private int countPossibilitiesTopDown(int amountLeft, int[] denominations, int index ){
//
//        String memoKey = amountLeft + ", " + index;
//        if(memo.containsKey(memoKey)){
//            System.out.println("grabbing memo [" + memoKey + "]");
//            return memo.get(memoKey);
//        }
//
//
//        if(amountLeft == 0){
//            return 1;
//        }
//
//        if(amountLeft < 0){
//            return 0;
//        }
//
//        if(index == denominations.length){
//            return 0;
//        }
//
//        System.out.println(String.format("checking ways to make %d with %s",
//                amountLeft, Arrays.toString(Arrays.copyOfRange(denominations,
//                        index, denominations.length))));
//
//        int currentCoin = denominations[index];
//
//        int numPossibilites = 0;
//        while(amountLeft >= 0){
//            numPossibilites += countPossibilitiesTopDown(amountLeft, denominations, index + 1);
//            amountLeft -= currentCoin;
//        }
//
//        memo.put(memoKey, numPossibilites);
//        return numPossibilites;
//    }



}
