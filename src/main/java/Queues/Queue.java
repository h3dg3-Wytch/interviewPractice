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
            head = node;
        }
        return;
    }

    public Node dequeue(Node<T> node){
        if(isEmpty()){
            return null;
        }
        return null;
    }


}
