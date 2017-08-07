package InterviewCake;

import java.util.Arrays;

/**
 * Created by h3dg3wytch on 7/18/17.
 */
public class ProblemThirtySix {

    public static void main(String[] args) {

    }

    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck){

        int currentFirstHalfIndex = 0;
        int currentSecondHalfIndex = 0;
        for(int i = 0; i < shuffledDeck.length; i++){
            if(currentFirstHalfIndex < half1.length && half1[currentFirstHalfIndex] == shuffledDeck[i]){
                currentFirstHalfIndex++;
            }else if(currentSecondHalfIndex < half2.length && half2[currentSecondHalfIndex] == shuffledDeck[i]){
                currentSecondHalfIndex++;
            }else{
                return false;
            }
        }

        return true;

    }

    private static int[] removeTopCard(int[] cards){
        return Arrays.copyOfRange(cards, 1, cards.length);
    }

    //recursive function
//    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck){
//        //base case
//        if(shuffledDeck.length == 0){
//            return true;
//        }
//
//        // if the top of shuffledDeck is the same as the top of half1
//        // (making sure first that we have a top card in half1)
//        if(half1.length > 0 && half1[0] == shuffledDeck[0] ){
//            // take the top cards off half1 and shuffledDeck and recurse
//            return isSingleRiffle(removeTopCard(half1), half2, removeTopCard(shuffledDeck));
//            // if the top of shuffledDeck is the same as the top of half2
//        }else if(half2.length > 0 && half2[0] == shuffledDeck[0]){
//            // take the top cards off half2 and shuffledDeck and recurse
//            return  isSingleRiffle(half1, removeTopCard(half2), removeTopCard(shuffledDeck));
//            // top of shuffledDeck doesn't match top of half1 or half2
//            // so we know it's not a single riffle
//        }else{
//            return false;
//        }
//    }
}
