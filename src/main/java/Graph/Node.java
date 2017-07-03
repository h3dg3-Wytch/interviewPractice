package Graph;

import java.util.ArrayList;

/**
 * Created by h3dg3wytch on 11/14/16.
 */
public class Node implements Comparable {


    private ArrayList<Node> nodes;
    private String name;
    private int weight;


    public Node(){
        this.weight = 0;
        this.name = "";
        this.nodes = new ArrayList<>();
    }
    public Node(String name){
        this.weight = 0;
        this.name = name;
        this.nodes = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        Node node = (Node) obj;
       return name.equals(node.name);
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


    public static void main(String[] args) {
        Node n = new Node("First");
        for(int i = 1; i < 5; i++){
            n.addNode(new Node(i + ""));
        }

        Graph g = new Graph();
        g.addNode(n);

        g.display();
    }

    @Override
    public int compareTo(Object o) {
        Node n = (Node) o;
        if(n.getWeight() < this.weight){
            return -1;
        }else if(n.getWeight() > this.weight){
            return 1;
        }else{
            return 0;
        }
    }
}
