import org.junit.Test;

/**
 * Created by h3dg3wytch on 8/27/16.
 */
public class RecursiveTest {

    @Test
    public void testWriteBackwards(){
        writeBackwards("hello, world");
    }

    private void writeBackwards(String s ) {
        if(s.length() >= 1){
            System.out.println(s.charAt(s.length() - 1));
            writeBackwards(s.substring(0, s.length() - 1 ));
        }
    }

    @Test
    public void testSteps(){
        System.out.println(steps(4));
    }

    private int steps(int steps){
        if(steps < 0){
            return 0;
        }else if(steps == 0){
            return 1;
        }
        return steps(steps - 1) + steps( steps - 2) + steps( steps - 3);
    }

    @Test
    public void testSpock(){
        System.out.println(spocksSelection(4, 2));
    }

    //finding k out of n things
    public int spocksSelection(int n, int k){
        if ((n == 0) || (k == 0 ))
            return 1;
        else if(k == n)
            return 1;
        else if(k > n)
            return 0;
        else
            return spocksSelection(n - 1, k -1) + spocksSelection(n -1, k);
    }
}
