package InterviewCake;

/**
 * Created by rex on 7/5/17.
 */
public class ProblemThirteen {

    public static void main(String[] args) {
        String[] words = new String[]{
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote", // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage",
        };

        for(String word : words){
            System.out.println(word.compareTo(words[0]));
        }

       // System.out.println(findRotationPoint(words));

    }



    public static int findRotationPoint(String[] words) {

        final String firstWord = words[0];

        int floorIndex = 0;
        int ceilingIndex = words.length - 1;

        while(floorIndex < ceilingIndex){
            // guess a point halfway between floor and ceiling
            int guessIndex = floorIndex + ((ceilingIndex - floorIndex) / 2);
            // if guess comes after first word os is the first word
            if( words[guessIndex].compareTo(firstWord) >= 0){

                //go right
                floorIndex = guessIndex;
            }else{
                ceilingIndex = guessIndex;
            }

            //if floor and ceiling and have converged
            if( floorIndex +1 == ceilingIndex){

                break;
            }
        }
        return ceilingIndex;

    }

}
