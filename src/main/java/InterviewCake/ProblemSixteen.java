package InterviewCake;

/**
 * Created by rex on 6/30/17.
 */
public class ProblemSixteen {

    public static void main(String[] args) {

        CakeType[] cakeTypes = new CakeType[] {
                new CakeType(7, 160),
                new CakeType(3, 90),
                new CakeType(2, 15),
        };

        int capacity = 20;

        maxDuffelBagValue(cakeTypes, capacity);

    }

    private static void maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {

    }

    public static class CakeType {

        int weight;
        int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value  = value;
        }

    }


}
