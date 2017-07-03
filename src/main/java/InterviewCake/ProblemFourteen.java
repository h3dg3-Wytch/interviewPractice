package InterviewCake;

import java.util.HashSet;

/**
 * Created by rex on 6/30/17.
 */
public class ProblemFourteen {

    public static void main(String[] args) {

    }

    public static int[] findMovieLength(int flightLength, int[] arrayOfMovieLengths){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < arrayOfMovieLengths.length; i++){
            hashSet.add(arrayOfMovieLengths[i]);
        }

        for(int i = 0; i < arrayOfMovieLengths.length; i++){
            int secondMovieLength = flightLength - arrayOfMovieLengths[i];
            if(hashSet.contains(secondMovieLength))
                return new int[]{arrayOfMovieLengths[i], secondMovieLength};
        }
        return null;
    }
}
