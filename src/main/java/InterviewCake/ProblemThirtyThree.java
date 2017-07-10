package InterviewCake;

/**
 * Created by rex on 7/7/17.
 */
public class ProblemThirtyThree {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5};
        System.out.println(findRepeatingNumber(array));

    }

    public static int findRepeatingNumber(int[] array){
        int triangleSum = (((array.length - 1 )* (array.length - 1)) + (array.length - 1)) / 2;
        int actualSum = 0;
        for(int i : array){
            actualSum += i;
        }

        return actualSum - triangleSum;

    }
}
