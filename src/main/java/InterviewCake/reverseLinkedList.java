package InterviewCake;

/**
 * Created by h3dg3wytch on 8/2/17.
 */
public class reverseLinkedList {


    public static class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }

        public void display(){
            System.out.println(value + " ");
            LinkedListNode runner = next;
            while (runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }


    public static LinkedListNode reverseLinkedList( LinkedListNode node){
        if(node == null){
            return null;
        }

        LinkedListNode prev = null;
        LinkedListNode curr = node;
        LinkedListNode next = null;

        while (curr != null){

           next = curr;
            curr.next = prev;
            prev = curr;

            curr = next;
        }

        return prev;
    }


    public static void main(String[] args) {

        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode next1 = new LinkedListNode(2);
        LinkedListNode next2 = new LinkedListNode(3);

        LinkedListNode n = reverseLinkedList(head);

        n.display();

    }
}
