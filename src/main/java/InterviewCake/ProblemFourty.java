package InterviewCake;

import java.util.HashSet;

/**
 * Created by rex on 7/8/17.
 */
public class ProblemFourty {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 5, 6};
        //System.out.println(findDuplicate(array));

    }

    //naive approach
//    public static Integer findDuplicate(int[] array){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i : array){
//            if(set.contains(i)){
//                return i;
//            }else{
//                set.add(i);
//            }
//        }
//        return null;
//    }

    //brute force approach
//    public static int findRepeat(int[] array){
//        for(int needle = 1; needle < array.length; needle++){
//            boolean hasBeenSeen = false;
//            for(int number : array){
//                if(needle == number){
//                    if(hasBeenSeen){
//                        return needle;
//                    }else{
//                        hasBeenSeen = true;
//                    }
//                }
//            }
//        }
//
//        //no argument throw duplicate
//        throw new IllegalArgumentException("No Duplicate element");
//    }

    //midway solution

}
