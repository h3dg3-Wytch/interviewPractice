package InterviewCake;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by h3dg3wytch on 7/18/17.
 */
public class ProblemThirtyOne {

    public static void main(String[] args) {

        System.out.println((getPermutations("cats")));

    }

   public static Set<String> getPermutations(String inputString){

       if(inputString.length() <= 1){
           return new HashSet<>(Arrays.asList(inputString));
       }

       String allCharsExceptLast = inputString.substring(0, inputString.length() - 1);
       char lastChar = inputString.charAt(inputString.length() - 1);

       //Recursive call: get all possible permutations for all chars except the last
       Set<String> permutationsOfAllCharsExceptLast = getPermutations(allCharsExceptLast);

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
