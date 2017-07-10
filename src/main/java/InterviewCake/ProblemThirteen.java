package InterviewCake;

/**
 * Created by rex on 7/5/17.
 */
public class ProblemThirteen {

    public static void main(String[] args) {
        String[] words = new String[]{
                "asymptote", // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage",
        };

        System.out.println(findRotationPoint(words));

    }



    public static int findRotationPoint(String[] words){
        String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while(floorIndex < ceilingIndex){
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);

            if(words[guessIndex].compareTo(firstWord) >= 0){
                floorIndex = guessIndex;
            }else{
                ceilingIndex = guessIndex;
            }

            // if floor and ceiling have converged
            if(floorIndex + 1 == ceilingIndex){
                // between floor and ceiling is where we flipped to the beginning
                // so ceiling is alphabetically first
                break;
            }


        }



        return ceilingIndex;
    }
}
