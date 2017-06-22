package InterviewCake;

/**
 * Created by rex on 6/22/17.
 */
public class ProblemFive {

    public static String denominations(int coin){

        if(coin == 1){
            return "1cent";
        }else if(coin == 2){
            return "2cent";
        }else if(coin == 3){
            return "3cent";
        }else if(coin <= 0){
            return "";
        }else{
            return denominations(coin - 1) + denominations(coin - 2) + denominations(coin - 3);
        }

    }

    public static void main(String[] args) {

        System.out.println(denominations(4));

    }
}
