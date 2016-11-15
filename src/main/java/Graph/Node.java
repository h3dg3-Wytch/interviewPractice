package Graph;

import java.util.ArrayList;

/**
 * Created by h3dg3wytch on 11/14/16.
 */
public class Node {


    private ArrayList<Node> nodes;
    private String name;
    private int weight;

    public Node(String name){
        this.weight = 0;
        this.name = name;
        this.nodes = new ArrayList<>();
    }
    public Node(String name, int weight){
        this.weight = weight;
        this.name = name;
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<Node> getAdjacentNodes(){
        return nodes;
    }

    @Override
    public String toString(){
        return name;
    }
}
