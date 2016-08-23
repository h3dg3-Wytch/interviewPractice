package Stacks;

/**
 * Created by rex on 8/11/16.
 */
public class Node<T> {

    Node<T> next;
    T t;

    public Node(T t){
        this.t = t;
    }

    public Node(Node<T> next, T t){
        this.next = next;
        this.t = t;
    }

    public Node<T> getNext() {
        return next;
    }

    public String toString(){
        return "Data Entry: " + t.toString();
    }

}
