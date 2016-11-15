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

    //hackerrannk array test
    @Test
    public void shift_test(){

        int[] array = new int[5];
        int index = 1;
        for(int i = 0; i < array.length; i++){
            array[i] = index;
            index++;
        }
        int[] output = arrayLeftRotation(array, 5, 4);
        for(int i = 0; i < output.length; i++)
            System.out.print(output[i] + " ");

        System.out.println();


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

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] result = new int[a.length];
        for(int i = 0; i < n; i++){
            int index = determineShiftPosition(i, n, k);
            result[index] = a[i];
        }
        return result;
    }

    private static int determineShiftPosition(int index, int lengthOfArray, int shift){
        int result = index - shift;
        if(result < 0){
            result += lengthOfArray;
        }
        return result;
    }


}
