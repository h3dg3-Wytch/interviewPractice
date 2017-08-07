package LeetCode;

/**
 * Created by h3dg3wytch on 8/4/17.
 */
public class RotateNodes {


    public static void main(String[] args) {

        int[] nums = {1, 2};

        rotate(nums, 1);

    }


    public static void rotate(int[] nums, int k) {

        if(k == 0){
            return;
        }

        int currentPointer = k;

        for(int i = 0; i < nums.length; i++){

            currentPointer = k % nums.length;


            nums[currentPointer] = nums[i];
            currentPointer++;
        }

    }
}
