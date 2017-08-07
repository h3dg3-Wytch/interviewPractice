package InterviewCake;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by rex on 7/8/17.
 */
public class ProblemFourty {

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 4, 5, 6};

        System.out.println(findRepeat(array));
        //System.out.println(findDuplicate(array));

    }


//    public static int findRepeat(int[] array){
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int num : array){
//
//            if(map.containsKey(num)){
//                return num;
//            }else{
//                map.put(num, 1);
//            }
//        }
//
//        throw new Error("There needs to be an integer that repeats!");
//
//    }
    //feat needle in hay stack
    public static int findRepeat(int[] array){

        for(int needle = 0; needle < array.length; needle++){
            boolean hasBeenSeen = false;
            for(int num : array){

                if(needle == num){
                    if(hasBeenSeen){
                        return num;
                    }else{
                        hasBeenSeen = true;
                    }
                }
            }
        }

        throw new Error("No repeats!");
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
