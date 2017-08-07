package InterviewCake;

import java.util.Arrays;

/**
 * Created by h3dg3wytch on 8/2/17.
 */
public class Mergey {

    public static void main(String[] args) {
        int[] shitList = {3, 2, 3, 1, 5, 2, 4};
        System.out.println(Arrays.toString(mergeSort(shitList)));

    }


    public static int[] mergeSort(int[] array){

        if(array.length <= 2){
            return array;
        }

        int midPoint = array.length / 2;
        int[] leftHalf = Arrays.copyOfRange(array, 0, midPoint);
        int[] rightHalf = Arrays.copyOfRange(array, midPoint, array.length);

        int[] sortedLeft= mergeSort(leftHalf);
        int[] sortedRight = mergeSort(rightHalf);

        int[] sortedArray = new int[array.length];
        int currentLeftIndex =0;
        int currentRightIndex = 0;

        for(int currentSortedIndex = 0; currentSortedIndex < sortedArray.length; currentSortedIndex++){

            if(currentLeftIndex < sortedLeft.length &&  (currentRightIndex >= sortedRight.length || sortedLeft[currentLeftIndex] < sortedRight[currentRightIndex]) ){
                sortedArray[currentSortedIndex] = sortedLeft[currentLeftIndex];
                currentLeftIndex++;
            }else{
                sortedArray[currentSortedIndex] = sortedRight[currentRightIndex];
                currentRightIndex++;
            }
        }

        return sortedArray;
    }
}
