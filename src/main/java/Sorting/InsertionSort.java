package Sorting;

/**
 * Created by rex on 8/29/16.
 */
public class InsertionSort {

    public int[] sort(int[] array){

        for(int i = 1; i < array.length; i++){
          for(int j = i; j > 0; j--){
              if(array[j] < array[j - 1]){
                  swap(j, j-1, array);
              }
          }
        }
        return array;
    }

    private void swap(int j, int i, int[] array) {
        int temp = j;
        array[j] = array[i];
        array[i] = j;
    }
}
