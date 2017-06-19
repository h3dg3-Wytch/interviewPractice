import Graph.Graph;
import Graph.Node;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by h3dg3wytch on 11/14/16.
 */
public class GraphTest {

    @Test
    public void testAdjacencyGraph(){
        Graph graph = new Graph();
        for(int i = 0; i < 5; i++){
            Node node = new Node("" + i);
            if(i % 2 == 0) {
                Node insert = new Node("" + (i + 1), i + 2);
                node.addNode(insert);
            }
            graph.addNode(node);
        }
        graph.display();
    }

    @Test
    public void testBreadthFirstGraphAlgo(){


    }
}
