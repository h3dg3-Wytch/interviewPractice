package Sorting;

import java.util.Arrays;

/**
 * Created by rex on 7/3/17.
 */
public class CountingSort {

    public static int[] sort(int[] array, int max){

       int[] numCount = new int[max + 1];

        for(int num : array){
            numCount[num]++;
        }

        int[] sortedArray = new int[array.length];
        int currentIndex = 0;

        for(int num = 0; num < numCount.length; num++){

            int count = numCount[num];
            for(int i = 0; i < count; i++){
                sortedArray[currentIndex] = num;
                currentIndex++;
            }

        }
        return sortedArray;
    }

    public static void main(String[] args) {

        int[] list = {3 , 2, 4, 5};
        System.out.println(Arrays.toString(CountingSort.sort(list, 6)));

    }
}
