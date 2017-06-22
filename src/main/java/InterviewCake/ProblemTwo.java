package InterviewCake;

/**
 * Created by rex on 6/20/17.
 */
public class ProblemTwo {

//    public static int[] getProductsOfAllIntsExceptAtIndex(int[] array){
//
//        int[] result = array.clone();
//        for(int i = 0; i < array.length; i++){
//            int sum = 1;
//            for(int j = 0; j < array.length; j++){
//                if(j != i){
//                    sum *= array[j];
//                }
//            }
//            result[i] = sum;
//        }
//        return result;
//    }

//    public static int[] getProductsOfAllIntsExceptAtIndex(int[] array){
//
//        int[] result = new int[array.length];
//        int productsSoFar =1;
//        for(int i = 0; i < array.length; i++){
//            result[i] = productsSoFar;
//            productsSoFar *= array[i];
//        }
//        return result;
//    }
//
//    public static int[] productsOfAllIntsBeforeIndex(int[] array){
//        int[] result = new int[array.length];
//        int productsSoFar =1;
//        for(int i = 0; i < array.length; i++){
//            result[i] = productsSoFar;
//            productsSoFar *= array[i];
//            int[] result = new int[array.length];
//        }
//        return result;
//    }
//
//    public static int[] productsOfAllIntsAfterIndex(int[] array){
//        int[] result = new int[array.length];
//        int productsSoFar =1;
//        for(int i = result.length; i >= 0; i--  ){
//            result[i] = array[i];
//        }
//        productsSoFar *= array[i];
//       return result;
//    }
//

    public static void main(String[] args) {

         int[] array = { 1, 7, 3, 4};
         int[] result = getProductsOfAllIntsExceptAtIndex(array);

         for(int i : result){
             System.out.println(i);
         }
    }


    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray){

        int[] productsWithoutIndex = new int[intArray.length];
        int productsSoFar = 1;
        for(int i = 0; i < intArray.length; i++){
            productsWithoutIndex[i] = productsSoFar;
            productsSoFar *= intArray[i];
        }

        productsSoFar = 1;
        for(int i = intArray.length - 1 ; i >=0; i--){
            productsWithoutIndex[i] *= productsSoFar;
            productsSoFar *= intArray[i];
        }

        return productsWithoutIndex;
    }
}
