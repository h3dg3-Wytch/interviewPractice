package InterviewCake;

/**
 * Created by rex on 6/30/17.
 */
public class Problem32 {

    public static void main(String[] args) {

    }

    public static int[] sortedScores(int highScore, int[] scores){

        int[] sortedScores = new int[highScore];

        for(int i = 0; i < scores.length; i++){
            int num = sortedScores[scores[i]];

            num = (num == 0) ? 1 : num + 1;

            sortedScores[scores[i]] = num;
        }

        return  sortedScores;
    }
}
