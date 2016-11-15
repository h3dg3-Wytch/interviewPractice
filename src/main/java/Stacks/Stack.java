package Stacks;



/**
 * Created by h3dg3wytch on 8/23/16.
 */
public class Stack<T> {

    private Node<T> top;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(Node<T> node){
        node.next = top;
        top = node;
    }

    public T pop(){
        if(!isEmpty()) {
            T item = top.t;
            top = top.next;
            return item;
        }
        return null;
    }
}
