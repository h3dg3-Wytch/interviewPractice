package main.java.LinkedLists;

import java.util.HashSet;

/**
 * Created by rex on 8/11/16.
 */
public class LinkedList<T> {

    private Node<T> head;

    public boolean isEmpty(){
        return head == null;
    }

    public void append(Node<T> node){
        if(head == null){
            head = node;
            return;
        }
        Node<T> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void remove(T t){
        if(head.t.equals(t)){
            head = head.next;
            return;
        }

        Node<T> prev = null;
        Node<T> current = head;

        while(current != null && !current.t.equals(t)){
            prev = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("ERROR, no such element");
            return;
        }
        prev.next = current.next;
    }

    public void insertAfter(T key, T value){
        Node<T> curr = head;
        while (curr != null && !curr.t.equals(key)) {
            curr = curr.next;
        }
        if(curr != null){
            curr.next = new Node<T>(curr.next, value);
        }
    }

    public void insertBefore(T key, T value){
        if(head.t.equals(value)){
            head = new Node<T>(head, value);
        }
        Node<T> prev = null;
        Node<T> curr = head;

        while(curr != null && !curr.t.equals(key)){
            prev= curr;
            curr = curr.next;
        }
        if(curr != null){
            prev.next = new Node<T>(curr, value);
        }

    }

    public void deleteDuplicates(T t){
        if(isEmpty()) return;
        HashSet<T> set = new HashSet<>();
        Node<T> prev = null;
        Node<T> curr = head;
        while(curr != null){
            if(set.contains(curr.t)){
                curr = curr.next;
                prev.next = curr;
            }else{
                set.add(t);
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public void deleteDuplicatesWithoutSet(T t){
        if(isEmpty())return;
        Node<T> curr = head;
        while(curr != null){
            Node<T> runner = curr;
            while(runner.next != null){
                if(runner.next.t.equals(curr.t)){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            curr = curr.next;
        }
    }
    //old dumb implementaiton
//    public T findKthFromLastElement(int kIndex){
//        Node<T> runner = head;
//        int numberOfElements =0;
//        while(runner != null){
//            numberOfElements++;
//            runner = runner.next;
//        }
//        int positionOfElement = numberOfElements - kIndex;
//
//        runner = head;
//        int index = 0;
//        while(index != positionOfElement){
//            runner = runner.next;
//            index++;
//        }
//        return runner.t;
//    }

    //Start a runner k elements ahead, it will end up hitting null k items away, and you can just then print out curr
    public T findKthFromLastElement(int kIndex){
        if(isEmpty()) return null;
        Node<T> curr = head;
        Node<T> runner = head;
        int index = 0;
        while(runner != null && index < kIndex ){
            runner = runner.next;
            index++;
        }
        while (runner != null){
            curr = curr.next;
            runner = runner.next;
        }
        return curr.t;
    }

    public int findKthFromLastElementRecursivley(Node<T> node, int kIndex){

        if(node == null){
            return 0;
        }
        int i = findKthFromLastElementRecursivley(node.next, kIndex) + 1;
        if(i == kIndex){
            System.out.println(node.toString());
        }
        return i;
    }

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }

    public Node<T> getHead() {
        return head;
    }




}
