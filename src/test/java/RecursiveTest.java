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
}
