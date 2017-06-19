package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by h3dg3wytch on 1/18/17.
 */
public class BreadthFirst {

    private BreadthFirstNode startNode;
    private BreadthFirstNode goalNode;

    private Queue<BreadthFirstNode> queue;
    private ArrayList<BreadthFirstNode> explored;

    public void compute(){

        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node found");
            System.out.println(startNode);
        }

    }

    private class BreadthFirstNode{

        private int data;

        private BreadthFirstNode leftNode;
        private BreadthFirstNode rightNode;


        public BreadthFirstNode(int data, BreadthFirstNode leftNode, BreadthFirstNode rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public BreadthFirstNode(int data) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public ArrayList<BreadthFirstNode> getChildren(){
            ArrayList<BreadthFirstNode> result = new ArrayList<>();
            if(leftNode != null)
                result.add(leftNode);
            if (rightNode != null)
                result.add(rightNode);

            return result;
        }
    }
}
