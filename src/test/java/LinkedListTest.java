package test.java;

import main.java.LinkedLists.LinkedList;
import main.java.LinkedLists.Node;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by rex on 8/11/16.
 */
public class LinkedListTest {

    @Test
    public void testLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 50; i++){
            linkedList.append(new Node<>(i));
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
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 100; i++){
            linkedList.append(new Node<Integer>(0));
        }

        linkedList.deleteDuplicates(0);
        linkedList.display();

        for(int i = 0; i < 3; i++){
            linkedList.append(new Node<Integer>(0));
        }

        linkedList.deleteDuplicatesWithoutSet(0);
        linkedList.display();
    }

    //Implement an algo to find the kth to the last element of a singly linked list.
    @Test
    public void test2_2(){

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0 ; i < 10; i++){
            list.append(new Node<Integer>(i));
        }

        assertEquals(list.findKthFromLastElement(2).intValue(), 8);

        assertEquals(list.findKthFromLastElementRecursivley(list.getHead(), 2), 10);
    }
}
