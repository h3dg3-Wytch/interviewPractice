package InterviewCake;

/**
 * Created by rex on 6/30/17.
 */
public class ProblemSixteen {

    public static void main(String[] args) {

        CakeType[] cakeTypes = new CakeType[] {
                new CakeType(1, 20),
                new CakeType(2, 10),
                new CakeType(3, 5),
        };

        int capacity = 3;

        System.out.println(maxDuffelBagValue(cakeTypes, capacity));

    }


    private static long maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {
        long[] maxValuesAtCapacities = new long[capacity + 1];

        for(int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++){

            long maxValueAtCurrentCapacity = 0;

            for(CakeType cake : cakeTypes){

                if(cake.weight <= currentCapacity){

                    long currentCakeValueAtCapacity = cake.value + maxValuesAtCapacities[currentCapacity - cake.weight];
                    maxValueAtCurrentCapacity = Math.max(currentCakeValueAtCapacity,maxValueAtCurrentCapacity );
                }
            }

            maxValuesAtCapacities[currentCapacity] = maxValueAtCurrentCapacity;
        }

        return maxValuesAtCapacities[capacity];
    }

//    private static long maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {
//
//        long[] maxValuesAtCapacities = new long[capacity + 1];
//
//        for(int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++){
//
//            long currentCapacityMaxValue = 0;
//            for(CakeType cake : cakeTypes){
//
//                if(cake.weight <= currentCapacity){
//
//                    long maxValueOfCake = cake.value + maxValuesAtCapacities[currentCapacity - cake.weight];
//                    currentCapacityMaxValue = Math.max(currentCapacityMaxValue, maxValueOfCake);
//                }
//            }
//            maxValuesAtCapacities[currentCapacity] = currentCapacityMaxValue;
//        }
//        return maxValuesAtCapacities[capacity];
//    }

    public static class CakeType {

        int weight;
        int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value  = value;
        }

    }


}
