import Stacks.Node;
import Stacks.Stack;
import org.junit.Test;

/**
 * Created by h3dg3wytch on 8/23/16.
 */
public class StackTest {

    @Test
    public void stackTest(){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i  < 10; i++){
            stack.push(new Node<Integer>(i));
        }
        for(int i = 0; i < 10; i++){
            System.out.println(stack.pop());
        }
    }
}
