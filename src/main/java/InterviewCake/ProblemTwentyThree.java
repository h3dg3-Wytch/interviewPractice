package InterviewCake;

import sun.awt.image.ImageWatched;

/**
 * Created by rex on 6/28/17.
 */
public class ProblemTwentyThree {

    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static boolean isThereACycle(LinkedListNode node){
        LinkedListNode slowRunner = node;
        LinkedListNode fastRunner = node;

        while(fastRunner != null){
            if(fastRunner.equals(slowRunner)){
                return true;
            }

            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
        }

        return false;

    }

    public static void main(String[] args) {

    }
}
