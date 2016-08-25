package Queues;


/**
 * Created by h3dg3wytch on 8/24/16.
 */
public class Queue<T> {
    Node<T> head;
    Node<T> tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(Node<T> node){
        if(isEmpty()){
            tail = node;
            head = tail;
        }else{
            tail.next = node;
            tail = tail.next;
        }
    }

    public Node dequeue(){
            Node node = head;
            head = head.next;
            if(isEmpty()) tail = null;
            System.out.println(node.toString());
            return node;
    }


}
