package InterviewCake;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by h3dg3wytch on 7/15/17.
 */
public class ProblemNine {

    public static void main(String[] args) {

    }

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

    private static class NodeBound{
        BinaryTreeNode node;
        int lowerBound;
        int upperBound;

        NodeBound(BinaryTreeNode node, int lowerBound, int upperBound){
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }


    public static boolean isValidBinarySearchTree(BinaryTreeNode treeRoot){
        if(treeRoot == null){
            return true;
        }
        Stack<NodeBound> nodeBounds = new Stack<>();
        nodeBounds.push(new NodeBound(treeRoot, Integer.MIN_VALUE, Integer.MAX_VALUE));
        while(!nodeBounds.isEmpty()){
            NodeBound nodeBound = nodeBounds.pop();
            BinaryTreeNode node = nodeBound.node;
            int lowerBound = nodeBound.lowerBound;
            int upperBound = nodeBound.upperBound;

            if(node.value >= upperBound || node.value <= lowerBound){
                return false;
            }

            if(node.left != null){
                nodeBounds.push(new NodeBound(node.left, node.value, upperBound));
            }

            if(node.right != null){
                nodeBounds.push(new NodeBound(node.right, lowerBound, node.value));
            }
        }
        return true;
    }

    //recursive
    public static boolean isValidBinarySearchTree(BinaryTreeNode root, int lowerBound, int upperBound){
        if(root == null){
            return true;
        }
        if(root.value >= upperBound || root.value <= lowerBound){
            return false;
        }
        return isValidBinarySearchTree(root.left, root.value, upperBound ) && isValidBinarySearchTree(root, lowerBound, root.value);
    }

}
