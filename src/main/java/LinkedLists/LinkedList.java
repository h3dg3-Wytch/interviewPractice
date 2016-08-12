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

    public void display(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }


}
