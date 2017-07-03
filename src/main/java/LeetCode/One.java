package LeetCode;

/**
 * Created by rex on 6/29/17.
 */
public class One {


    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 4, 5};

        array = twoSum(array, 6);

        for(int i: array){
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] array, int target){
        for(int i = 0 ; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i != j && array[i] + array[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
