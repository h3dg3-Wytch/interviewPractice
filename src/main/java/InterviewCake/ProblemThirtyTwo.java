package InterviewCake;

/**
 * Created by rex on 7/6/17.
 */
public class ProblemThirtyTwo {

    public static int[] generateScores(int[] unsortedScores, int highestPossibleScore){
        int[] nums = new int[highestPossibleScore + 1];
        for(int i : unsortedScores){
            nums[i]++;
        }

        int[] sortedArray = new int[unsortedScores.length];
        int sortedIndex = 0;

        for(int numberIndex = 0 ; numberIndex < nums.length; numberIndex++ ){
            int num = nums[numberIndex];
            for(int i = 0; i < num; i++){
                sortedArray[sortedIndex] = numberIndex;
                sortedIndex++;
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5};

        for(int i : generateScores(array, 5)){
            System.out.println(i);
        }
    }
}
