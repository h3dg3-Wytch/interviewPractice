package InterviewCake;

/**
 * Created by rex on 7/7/17.
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 5, 6};
        mergesort(array, 0, array.length -1 );
        for(int i : array){
            System.out.println(i);
        }

    }


    public static void mergesort(int[] array, int left, int right){
        int index = partition(array, left, right);
        if(left < index - 1){ //sort left half
            mergesort(array, left, index - 1);
        }
        if(index < right){ //sort right half
            mergesort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[((left + right) / 2)];
        while(left <= right) {
            //find an element on the left that should be on the right
            while (array[left] < pivot) {
                left++;
            }
            //find an element on the right that should be on the left
            while (array[right] > pivot){
                right--;
            }
            if (left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return  left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
