package InterviewCake;

/**
 * Created by rex on 6/28/17.
 */
public class ProblemTwentyTwo {


    public static class LinkedListNode {

        public String value;
        public LinkedListNode next;

        public LinkedListNode(String value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {

        LinkedListNode a = new LinkedListNode("A");
        LinkedListNode b = new LinkedListNode("B");
        LinkedListNode c = new LinkedListNode("C");

    }



    public static void deleteNode(LinkedListNode node){
        node.value = node.next.value;
        node.next = node.next.next;

    }
}
