package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by h3dg3wytch on 11/14/16.
 */
public class Graph {

    private ArrayList<Node> nodes;

    public Graph(){
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public ArrayList<Node> getAdajecenyList(){
        return nodes;
    }

    public void display(){
        for(Node node : nodes){
            System.out.println(node.toString() + ": Adjacent Nodes");
            System.out.println("----------");
            for(Node adjacentNode : node.getAdjacentNodes()){
                System.out.println("Name: " + adjacentNode.toString() + " Weight: "+adjacentNode.getWeight());
            }
        }
    }
}
