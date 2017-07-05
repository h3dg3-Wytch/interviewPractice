package Sorting;

/**
 * Created by rex on 7/3/17.
 */
public class CountingSort {

    public static int[] sort(int[] theArray, int maxValue){

        int[] numCount = new int[maxValue + 1];

       for(int num : theArray){
           numCount[num]++;
       }

       int[] sortedArray = new int[theArray.length];
       int currentSortedIndex = 0;

       for(int num = 0; num < numCount.length; num++){
            int count = numCount[num];
            for(int i = 0; i < count; i++){
                sortedArray[currentSortedIndex] = num;
                currentSortedIndex++;
            }
       }
        return sortedArray;
    }

    public static void main(String[] args) {
        CountingSort.sort(null, 6);

    }
}
