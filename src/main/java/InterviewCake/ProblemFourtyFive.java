package InterviewCake;

import Graph.Graph;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by h3dg3wytch on 7/21/17.
 */
public class ProblemFourtyFive {
    public static class GraphNode{
        private String label;
        private Set<GraphNode> neighbors;
        private Optional<String> color;


        public GraphNode(String label){
            this.label = label;
            this.neighbors = new HashSet<>();
            this.color = Optional.empty();
        }

        public String getLabel() {
            return label;
        }

        public Set<GraphNode> getNeighbors() {
            return Collections.unmodifiableSet(neighbors);
        }

        public void addNeighbor(GraphNode node){
            neighbors.add(node);
        }

        public boolean hasColor() {
            return this.color.isPresent();
        }

        public String getColor() {
            return this.color.get();
        }

        public void setColor(String color) {
            this.color = Optional.ofNullable(color);
        }
    }

    public static void main(String[] args) {
        GraphNode a = new GraphNode("a");
        GraphNode b = new GraphNode("b");
        GraphNode c = new GraphNode("c");

        a.addNeighbor(b);
        b.addNeighbor(a);
        b.addNeighbor(c);
        c.addNeighbor(b);

        List<GraphNode> graph = Arrays.asList(a, b, c);

        List<String> colors = Arrays.asList(new String[]{"red", "yellow", "blue", "green"});
    }

    public static void colorGraph(List<GraphNode> graph, List<String> colors){

        for(GraphNode node : graph){

            //get the nodes neighbors colors, as a set
            //so we can check if a color is illegal in constant time

            Set<String> illegalColors = new HashSet<>();
            for(GraphNode neighbor : node.getNeighbors()){
                if(neighbor.hasColor()){
                    illegalColors.add(neighbor.getColor());
                }
            }

            Set<String> legalColors = new HashSet<>();
            for(String color : colors){
                if(!illegalColors.contains(color)){
                    legalColors.add(color);
                }
            }

            //assign the first legal color
            node.setColor(legalColors.iterator().next());
        }
    }
}
