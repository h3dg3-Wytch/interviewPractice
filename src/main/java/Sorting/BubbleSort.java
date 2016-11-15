package Sorting;

/**
 * Created by rex on 8/26/16.
 */
public class BubbleSort {

    public int[] sort(int[] array){

        while(true){
            boolean swapped = false;
            for(int i = 1 ; i < array.length; i++){
                if(array[i - 1] > array[i]){
                    swap( i - 1, i, array);
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }

        }
        return array;
    }

    private void swap(int a, int b, int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
