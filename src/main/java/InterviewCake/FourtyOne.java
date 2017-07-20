package InterviewCake;

/**
 * Created by rex on 7/8/17.
 */
public class FourtyOne {

    public static void main(String[] args) {

    }

    public static int findDuplicate(int[] intArray) {

        int n = intArray.length - 1;

        // STEP 1: GET INSIDE A CYCLE
        // start at position n+1 and walk n steps to
        // find a position guaranteed to be in a cycle
        int positionInCycle = n + 1;
        for (int i = 0; i < n; i++) {
            positionInCycle = intArray[positionInCycle - 1];
        }
        return -1;
    }
}
