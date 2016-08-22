import BinaryTree.BST;
import BinaryTree.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by h3dg3wytch on 8/19/16.
 */
public class BSTTest {

    @Test
    public void testAdditionToTree(){
        BST tree = new BST();

        for(int i = 0; i < 10; i++){
            tree.addNode(new Node(i));
        }

        System.out.println("In order Test");

        tree.inFixTraversal(tree.root);

        System.out.println("Post order Test");

        tree.postOrderTraversal(tree.root);

        System.out.println("Pre Order Test");
        tree.preOrderTraversal(tree.root);
    }

    @Test
    public void findElement(){
        BST tree = new BST();

        for(int i = 0; i < 10; i++){
            tree.addNode(new Node(i));
        }
        assertEquals(tree.find(3).getNum(), 3);
    }
    @Test
    public void removal(){
        BST tree = new BST();

        tree.addNode(new Node(0));
        tree.addNode(new Node(1));
        tree.addNode(new Node(2));

        tree.inFixTraversal(tree.root);

        assertEquals(tree.delete(2), true);

        System.out.println("Deleted num 2");
        tree.inFixTraversal(tree.root);
    }

}
