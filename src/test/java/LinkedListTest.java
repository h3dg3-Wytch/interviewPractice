
import LinkedLists.LinkedList;
import LinkedLists.Node;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rex on 8/11/16.
 */
public class LinkedListTest {



    @Test   
    public void testLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for(int i = 0; i < 50; i++){
            linkedList.append(new Node<Integer>(i));
        }
        linkedList.display();

        for(int i = 10; i < 50; i++){
            linkedList.remove(i);
        }
        linkedList.display();
        linkedList.remove(50);

        linkedList.insertAfter(3, 50);
        linkedList.display();

        linkedList.insertBefore(50, 3);
        linkedList.display();
    }

    @Test
    public void test2_1(){
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        for(int i = 0; i < 100; i++){
//            linkedList.append(new Node<Integer>(0));
//        }
//
//        linkedList.deleteDuplicates(0);
//        linkedList.display();
//
//        for(int i = 0; i < 3; i++){
//            linkedList.append(new Node<Integer>(0));
//        }
//
//        linkedList.deleteDuplicatesWithoutSet(0);
//        linkedList.display();
    }

    //Implement an algo to find the kth to the last element of a singly linked list.
    @Test
    public void test2_2(){

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0 ; i < 10; i++){
            list.append(new Node<Integer>(i));
        }

        assertEquals(list.findKthFromLastElement(2).intValue(), 8);

        assertEquals(list.findKthFromLastElementRecursivley(list.getHead(), 2), 10);
    }

    //Delete a node from the middle of a linkedlist with only reference to that node
    @Test
    public void test2_3(){

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0 ; i < 10; i++){
            list.append(new Node<Integer>(i));
        }

        int index = 0;
        Node<Integer> runner = list.getHead();
        while (index < 3){
            runner = runner.getNext();
            index++;
        }

        list.deleteFromMiddle(runner);


    }
}
