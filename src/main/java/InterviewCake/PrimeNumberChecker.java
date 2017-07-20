package InterviewCake;

/**
 * Created by h3dg3wytch on 7/19/17.
 */
public class PrimeNumberChecker {

    public static void main(String[] args) {

        System.out.println(primeNaive(11));

    }

    public static boolean primeNaive(int n){

        if(n < 2){
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n % i == 0) return false;
        }

        return true;

    }
}
