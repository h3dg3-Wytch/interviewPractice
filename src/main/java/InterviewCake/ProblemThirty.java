package InterviewCake;

import java.util.HashMap;

/**
 * Created by rex on 6/29/17.
 */
public class ProblemThirty {

    public static void main(String[] args) {

        System.out.println(isAPalindrome("ivvvicc"));

    }

    public static boolean isAPalindrome(String s){
        HashMap<String, Integer> characterHash = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(characterHash.containsKey(s.charAt(i) + "")){
                int numberOfTimesInString = characterHash.get(s.charAt(i)+ "") + 1;
                characterHash.put(s.charAt(i) + "", numberOfTimesInString);
            }else{
                characterHash.put(s.charAt(i) + "", 1);
            }
        }

        boolean isAPalindrome = true;
        for(String c : characterHash.keySet()){
            if(characterHash.get(c) % 2 != 0 ){
                isAPalindrome = false;
            }
        }
        return isAPalindrome;
    }
}
