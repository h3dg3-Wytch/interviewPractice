package InterviewCake;

/**
 * Created by rex on 7/5/17.
 */
public class ProblemFourtyThree {

    public static void main(String[] args) {
        int[] myArray     = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        int[] result = mergeSort(myArray, alicesArray);
        for(int i : result){
            System.out.println(i);
        }
    }

    private static int[] mergeSort(int[] firstArray, int[] secondArray) {

        int[] sortedArray = new int[firstArray.length + secondArray.length];
        int currentLeftIndex = 0;
        int currentRightIndex = 0;

        for(int currentSortedIndex = 0; currentSortedIndex < sortedArray.length; currentSortedIndex++){
            if(currentLeftIndex < firstArray.length && (currentRightIndex >= secondArray.length
                    || firstArray[currentLeftIndex] < secondArray[currentRightIndex])){
                sortedArray[currentSortedIndex] = firstArray[currentLeftIndex];
                currentLeftIndex++;
            }else{
                sortedArray[currentSortedIndex] = secondArray[currentRightIndex];
                currentRightIndex++;
            }
        }
        return sortedArray;
    }


}
