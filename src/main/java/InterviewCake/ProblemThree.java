package InterviewCake;

/**
 * Created by rex on 6/20/17.
 */
public class ProblemThree {
    public static void main(String[] args) {

        int[] intArray = new int[]{1, 10, -5, 1, -100};

        System.out.println(arrayOfInts(intArray));

    }

    //brute force
//    public static int arrayOfInts(int[] intArray){
//
//        int max = intArray[0] * intArray[1] * intArray[2];
//        for(int i = 0; i < intArray.length; i++){
//            int num = intArray[i];
//            for(int j = 0; j < intArray.length; j++){
//                if(j != i){
//                    for(int k = 0; k < intArray.length; k++){
//                        if(j != k && i != k){
//                            max = Math.max(max,intArray[i] * intArray[j] * intArray[k]);
//                        }
//                    }
//                }
//            }
//        }
//        return max;
//    }

    //optimal solution
    public  static int arrayOfInts(int[] intArray){
        int highest = Math.max(intArray[0], intArray[1]);
        int lowest = Math.min(intArray[0], intArray[1]);

        int highestProductOf2 = intArray[0] * intArray[1];
        int lowestProductOf2 = intArray[0] * intArray[1];
    
        int highestProductOf3 = intArray[0] * intArray[1] * intArray[2];

        for(int i = 2; i < intArray.length; i++){

            int current = intArray[i];

            highestProductOf3  = Math.max(current * highestProductOf2, current * lowestProductOf2);

            highestProductOf2 = Math.max(current * highest, current * lowestProductOf2);
            lowestProductOf2 = Math.min(current * highest, current * lowest);

            highest = Math.max(highest, current);
            lowest = Math.min(lowest, current);
        }

        return  highestProductOf3;
    }

}
