package InterviewCake;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rex on 6/27/17.
 */
public class ProblemEight {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    public static void main(String[] args) {

    }

    private static class NodeDepthPair {
        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    public static boolean isBalanced(BinaryTreeNode treeRoot){
        if(treeRoot == null){
            return true;
        }
        //nodes will store pairs of a node and the node's depth
        List<Integer> depths = new ArrayList<>(3);
        // nodes will store pairs of a node and the node's depth
        Stack<NodeDepthPair> nodes = new Stack<>();
        nodes.push(new NodeDepthPair(treeRoot, 0));

        while(!nodes.empty()){
            NodeDepthPair nodeDepthPair = nodes.pop();
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            //case: we found a leaf
            if(node.left == null && node.right == null){
                //we only care if it's a new depth
                if(!depths.contains(depth)){
                    depths.add(depth);

                    //two ways we might now have an unbalanced tree
                    // 1) more than 2 different leaf depths
                    // 2) 2 leaf depths that are more than 1 apart

                    if(depths.size() > 2 || (depths.size() == 2
                            && Math.abs(depths.get(0) - depths.get(1)) > 1 )){
                        return false;
                    }
                }else{
                    if(node.left != null){
                        nodes.push(new NodeDepthPair(node.left, depth + 1));
                    }
                    if(node.right != null){
                        nodes.push(new NodeDepthPair(node.right, depth + 1));
                    }
                }
            }
        }
        return true;
    }


}
