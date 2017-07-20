package InterviewCake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by h3dg3wytch on 7/18/17.
 */
public class ProblemThirtyOne {

    public static void main(String[] args) {

    }

    public static Set<String> getPerumtations(String inputString){

        //base case
        if(inputString.length() <= 1){
            return new HashSet<>(Arrays.asList(inputString));
        }

        String allCharsExceptLast = inputString.substring(0, inputString.length() - 1);
        char lastChar = inputString.charAt(inputString.length() - 1);

        // recursive call: get all possible permutations for all chars exept last
        Set<String> permutationsOfAllCharsExceptLast = getPerumtations(allCharsExceptLast);

        //put the last char in all possible postitions for each of the above permutations
        Set<String> permutations = new HashSet<>();
        for(String permutationOfAllCharsExceptLast : permutationsOfAllCharsExceptLast){

            for(int position = 0; position <= allCharsExceptLast.length(); position++){
                String permutation = permutationOfAllCharsExceptLast.substring(0, position) + lastChar + permutationOfAllCharsExceptLast.substring(position);
                permutations.add(permutation);
            }

        }

        return permutations;


    }

}
