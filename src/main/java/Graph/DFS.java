package Graph;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by rex on 7/3/17.
 */
public class DFS {

    private static HashSet<Node> visited = new HashSet<>();
    private static Stack<Node> stack = new Stack<>();

    public static void main(String[] args) {
        Node n1 = new Node("One");
        Node n2 = new Node("Two");
        Node n3 = new Node("Three");
        Node n4 = new Node("Four");
        Node n5 = new Node("Five");

        n1.addNode(n2);
        n1.addNode(n3);

        n2.addNode(n4);

        n3.addNode(n5);



        Graph g = new Graph();
        g.addNode(n1);
        g.addNode(n2);
        g.addNode(n3);

        recursiveExecution(g, n1);





    }

    public static void execute(Graph graph, Node s){
        stack.push(s);
        while (!stack.isEmpty()){
            //pop a vertex from the stack to visit next
            Node node = stack.pop();
            System.out.println(node.toString());
            for(Node n : node.getAdjacentNodes()){
                if(!visited.contains(n)){
                    stack.push(n);
                    visited.add(n);
                }
            }

        }
    }

    public static void recursiveExecution(Graph graph, Node source){

        visited.add(source);
        System.out.println(source.toString());
        for(Node n : source.getAdjacentNodes()){
            if(!visited.contains(n)){
                recursiveExecution(graph, n);
            }
        }

    }
}
