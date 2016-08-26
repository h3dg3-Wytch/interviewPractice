package test.java;

import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.assertEquals;

/**
 * Created by rex on 8/26/16.
 */
public class ArraysTest {

    @Test
    public void test1_1(){
        assertEquals(question1_1("ava"), false);
        assertEquals(question1_1("time"), true);
        assertEquals(question1_1("rhmywe"), true);
        assertEquals(question1_1("aaaa"), false);
    }

    private boolean question1_1(String string){
        Hashtable<Character, Character> hashtable = new Hashtable<>();
        for(int i = 0; i < string.length(); i++){
            if(hashtable.contains(string.charAt(i)))
                return false;
            else
                hashtable.put(string.charAt(i), string.charAt(i));
        }
        return true;
    }
}
