package LeetCode;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class RemoveDupsFromArray {

    public static void main(String[] args) {

        int[] array = {1, 1, 2};

        System.out.println(removeDuplicates(array));

    }


    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int size = nums.length;
        int currentUniqueInteger = nums[0];

        for(int i = 1; i < nums.length; i++ ){

            if(currentUniqueInteger == nums[i]){
                size--;
            }else{
                currentUniqueInteger = nums[i];
            }


        }

        return size;

    }
}
