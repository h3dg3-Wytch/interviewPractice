import Sorting.BubbleSort;
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
}
