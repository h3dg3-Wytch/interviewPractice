package LeetCode;

import java.util.List;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class DeleteLinkedListNodes {


     public static class ListNode {
        int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        removeElements(node, 2);
    }


    public static ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }
        while(head != null && head.val == val ){
            head = head.next;
        }

        ListNode current = head;

        while(current != null){

          while(current.next != null && current.next.val == val){
              current.next.val = current.next.next.val;
              current = current.next;
          }

          current = current.next;
        }

        return head;



    }
}
