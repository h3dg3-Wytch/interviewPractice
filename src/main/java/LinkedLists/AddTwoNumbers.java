package LinkedLists;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {

        ListNode node = new ListNode(5);
        node.next = new ListNode(0);

       ListNode result = addTwoNumers(node, node);

    }

    public static ListNode addTwoNumers(ListNode l1, ListNode l2){

        ListNode listOneNode = l1;
        ListNode listTwoNode = l2;

        return null;



//        int sizeOfListOne = 0;
//        ListNode runner = l1;
//
//        while (runner != null){
//            sizeOfListOne++;
//            runner = runner.next;
//        }
//
//        int sizeOfListTwo = 0;
//        runner = l2;
//        while (runner != null){
//            sizeOfListTwo++;
//            runner = runner.next;
//        }
//
//        int numberOfListOne = 0;
//        runner = l1;
//        while (runner != null){
//            int currentPlace = runner.val *  (int) Math.pow(10, sizeOfListOne -1);
//            numberOfListOne += currentPlace;
//            sizeOfListOne--;
//            runner = runner.next;
//        }
//
//        int numberOfListTwo = 0;
//        runner = l2;
//        while (runner != null){
//            int currentPlace = runner.val *  (int) Math.pow(10, sizeOfListTwo -1);
//            numberOfListTwo += currentPlace;
//            sizeOfListTwo--;
//            runner = runner.next;
//        }
//
//       int result = numberOfListOne + numberOfListTwo;
//        String resultToString = Integer.toString(result);
//        char[] resultCharArray = resultToString.toCharArray();
//
//        ListNode tail = new ListNode(resultCharArray[0]);
//        for(int i = 1; i < resultCharArray.length; i++){
//
//            tail.next = new ListNode(Integer.parseInt(resultCharArray[i] +""));
//            tail = tail.next;
//        }
//
//        return tail;

    }
}
