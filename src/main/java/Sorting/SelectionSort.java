package Sorting;

/**
 * Created by h3dg3wytch on 8/26/16.
 */
public class SelectionSort {

    public int[] sort(int[] array){

        for(int i = array.length - 1; i > 0; i--){

            int largestPosition = findLargestElementPosition(array, i);
            swap(largestPosition, i , array);
        }

        return array;

    }

    private int findLargestElementPosition(int[] array, int size) {

        int largest = array[0];
        int result = 0;
        for(int i = 1; i <= size; i++){
            if(array[i] > largest){
                largest = array[i];
                result = i;
            }
        }
        return result;
    }


    private void swap(int a, int b, int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
