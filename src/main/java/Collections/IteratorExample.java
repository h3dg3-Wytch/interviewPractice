package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by h3dg3wytch on 7/20/17.
 */
public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(int i = 65; i < 91; i++){
            list.add((char) i + "");


        Iterator itr = list.iterator();

        while(itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Modify the objects being iterated
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Object element = listIterator.next();
            listIterator.set(element + "-");
        }

        System.out.println("Now, the modified contents");

        itr = list.iterator();
        while (itr.hasNext()){
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Reversed");
        while(listIterator.hasPrevious()){
            Object element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
    }
}
