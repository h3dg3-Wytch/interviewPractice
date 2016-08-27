package Searching;

/**
 * Created by h3dg3wytch on 8/27/16.
 */
public class BinarySearch {

    public int search(int[] array, int first, int last, int value){
        if(first > last){
            return -1;
        }else{
            int index;
            int mid = (first + last) / 2;
            if(value == array[mid]){
                return mid;
            }else if(value < array[mid]){
                index = search(array, first, mid - 1, value);
            }else{
                index = search(array, mid + 1, last, value);
            }
            return index;
        }
    }
}
