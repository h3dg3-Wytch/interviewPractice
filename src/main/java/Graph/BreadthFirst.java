package Graph;

import java.util.*;

/**
 * Created by h3dg3wytch on 1/18/17.
 */
public class BreadthFirst {

//    private BreadthFirstNode startNode;
//    private BreadthFirstNode goalNode;
//
//    private Queue<BreadthFirstNode> queue;
//    private ArrayList<BreadthFirstNode> explored;
//
//    public void compute(){
//
//        if(this.startNode.equals(goalNode)){
//            System.out.println("Goal Node found");
//            System.out.println(startNode);
//        }
//
//    }
//
//    private class BreadthFirstNode{
//
//        private int data;
//
//        private BreadthFirstNode leftNode;
//        private BreadthFirstNode rightNode;
//
//
//        public BreadthFirstNode(int data, BreadthFirstNode leftNode, BreadthFirstNode rightNode) {
//            this.data = data;
//            this.leftNode = leftNode;
//            this.rightNode = rightNode;
//        }
//
//        public BreadthFirstNode(int data) {
//            this.data = data;
//            this.leftNode = leftNode;
//            this.rightNode = rightNode;
//        }
//
//        public ArrayList<BreadthFirstNode> getChildren(){
//            ArrayList<BreadthFirstNode> result = new ArrayList<>();
//            if(leftNode != null)
//                result.add(leftNode);
//            if (rightNode != null)
//                result.add(rightNode);
//
//            return result;
//        }
//    }


    public static Queue<Node> queue = new PriorityQueue<>();
    public static HashSet<Node> visisted = new HashSet<>();

    public static void main(String[] args) {

        Node source = new Node("Source");

        Node n1 = new Node("One");
        Node n2 = new Node("Two");
        Node n3 = new Node("Three");
        Node n4 = new Node("Four");
        Node n5 = new Node("Five");

       source.addNode(n1);
       source.addNode(n2);

       n1.addNode(n3);

       n2.addNode(n3);
       n2.addNode(n4);

       n3.addNode(n5);


       Graph graph = new Graph();

       graph.addNode(source);
       graph.addNode(n1);
       graph.addNode(n2);
       graph.addNode(n3);

       compute(graph, source);

    }

    public static void compute(Graph graph, Node source){
        queue.add(source);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.println(node.toString());
            for(Node n : node.getAdjacentNodes()){
                if(!visisted.contains(n)) {
                    queue.add(n);
                    visisted.add(n);
                }
            }
        }
    }
}
