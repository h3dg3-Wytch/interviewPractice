package Sorting;

/**
 * Created by h3dg3wytch on 8/27/16.
 */
public class MergeSort {

    public void mergeSort(int[] array, int[] tempArray, int firstItemPosition, int lastItemPostion){

        if(firstItemPosition < lastItemPostion){
            //sort each half
            int mid = (firstItemPosition + lastItemPostion) / 2;
            mergeSort(array, tempArray, firstItemPosition, mid);
            mergeSort(array, tempArray, mid + 1, lastItemPostion);

            //merge the two halves
            merge(array, tempArray, firstItemPosition, mid, lastItemPostion);
        }
    }

    private void merge(int[] array, int[] tempArray, int firstItemPosition, int mid, int lastItemPostion) {

        //intiailze the local indexes to indicate the subarrays
        int first1 = firstItemPosition;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = lastItemPostion;
        //While both subarrays are not empty, copy this smaller item onto the temp array
        int index = first1; //next avaible location in the tempArray

        while((first1 <= last1) && (first2 <= last2)){
            if(array[first1] < array[first2]){
                tempArray[index] = array[first1];
                first1++;
            }else{
                tempArray[index] = array[first2];
                first2++;
            }
            index++;
        }

        //finish off the first subarray
        while(first1 <= last1){
            tempArray[index] = array[first1];
            first1++;
            index++;
        }
        while(first2 <= last2){
            tempArray[index] = array[first2];
            first2++;
            index++;
        }
        //Copy everything back over to the original array
        for(index = firstItemPosition; index< lastItemPostion; index++){
            array[index] = tempArray[index];
        }

    }


}
