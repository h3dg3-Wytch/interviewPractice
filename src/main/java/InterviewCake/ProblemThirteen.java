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
    }

    public static int findRotationPoint(String[] words){
        int floorIndex = -1;
        int ceilingIndex = words.length;

        while(floorIndex + 1 < ceilingIndex){
            int guessIndex = (floorIndex + ceilingIndex) / 2;

            if(words)
        }
    }
}
