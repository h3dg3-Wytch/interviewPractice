import AI.BreadthFirstSearch;
import Graph.BreadthFirst;
import Searching.BinarySearch;
import Sorting.BubbleSort;
import Sorting.MergeSort;
import Sorting.SelectionSort;
import Sorting.InsertionSort;
import org.junit.Test;

import java.awt.*;

/**
 * Created by rex on 8/26/16.
 */
public class SortTest {
    @Test
    public void bubbleSortTest(){
        BubbleSort sort = new BubbleSort();
        int[] array = {1, 3, 2, 5};
        int[] result  = sort.sort(array);

        int largest = result[0];
        for(int i = 1 ; i < result.length; i++){
            assert largest < result[i];
        }
    }
    @Test
    public void sortTest(){
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 3, 2, 5};
        int[] result  = selectionSort.sort(array);

        int largest = result[0];
        for(int i = 1 ; i < result.length; i++){
            assert largest < result[i];
        }
    }

    @Test
    public void mergeSort(){
        MergeSort mergeSort = new MergeSort();
        int[] array = {3, 2, 5, 4};
        int[] tempArray = new int[array.length];
        mergeSort.mergeSort(array, tempArray,0, array.length -1);
    }

    @Test
    public void binarySearchTest(){
        BinarySearch search = new BinarySearch();
        int[] array = {3, 2, 5, 4};
        System.out.println(search.search(array, 0, array.length, 5));
    }

    @Test
    public void insertionTest(){
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {3, 2, 5, 4};
        int[] result  = insertionSort.sort(array);

        int largest = result[0];
        for(int i = 1 ; i < result.length; i++){
            assert largest < result[i];
        }
    }

    @Test
    public void breadthFristSearchTest(){
        //implemented via main method
    }

    @Test
    public void quizTest(){
        System.out.println(mystery(new int[]{3, 12}));
        System.out.println(mystery(new int[]{4,2,10,8}));

        int a = 7;
        int b= 9;
        Point p1 = new Point();
        Point p2;

        System.out.println(p2.x);


    }


    private static int mystery(int[] list){
        int x = 0;
        for(int i = 1; i < list.length; i++) {
            int y = list[i] - list[0];
            if (y > x) {
                x = y;
            }
        }
        return x;
    }
}
