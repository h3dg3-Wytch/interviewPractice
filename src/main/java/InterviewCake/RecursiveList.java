package InterviewCake;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by h3dg3wytch on 7/30/17.
 */
public class RecursiveList {

    private static Map<Integer, Integer> memoCache = new HashMap<>();


    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};

        //travelRecursively(list);
        travelMemoRecursively(list);
    }

    public static void travelRecursively(int[] list){
        travelRecursively(0, list);
    }

    public static void travelRecursively(int currentIndex, int[] list){

        if(currentIndex == list.length){
            return;
        }
        System.out.println(list[currentIndex]);

        travelRecursively(currentIndex + 1, list);
    }

    public static void travelMemoRecursively(int[] list){
        travelMemoRecursively(0, list);
    }

    public static void travelMemoRecursively(int currentIndex, int[] list){
        if(memoCache.containsKey(currentIndex)){
            System.out.println("memo cache: " + currentIndex);
            return;
        }

        if(currentIndex == list.length){
            return;
        }

        System.out.println(list[currentIndex]);

        memoCache.put(currentIndex, list[currentIndex]);

        travelMemoRecursively(currentIndex + 1, list);


    }
}
