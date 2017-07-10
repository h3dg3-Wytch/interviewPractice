package InterviewCake;

/**
 * Created by rex on 7/6/17.
 */
public class ProblemThirtyOne {

    public static void main(String[] args) {
        System.out.println(permutations("Hello"));
    }

    public static String permutations(String string){
        if(string.length() == 1){
            return string;
        }else{
            return permutations(string.substring(0 , string.length() - 1));
        }
    }
}
