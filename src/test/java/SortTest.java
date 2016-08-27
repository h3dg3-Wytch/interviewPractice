import Searching.BinarySearch;
import Sorting.BubbleSort;
import Sorting.MergeSort;
import Sorting.SelectionSort;
import org.junit.Test;

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
}
