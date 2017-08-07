package InterviewCake;

import Graph.Node;

import java.util.*;

/**
 * Created by h3dg3wytch on 8/2/17.
 */
public class BSTCheck {


    private static class BinaryTreeNode{

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

  public static BinaryTreeNode findLargestItem(BinaryTreeNode node){

      if(node == null){
          return null;
      }

      while (node.right != null){
          node = node.right;
      }

      return node;
  }


  public static int find2ndLargestElement(BinaryTreeNode node){
      if(node == null){
          return Integer.MIN_VALUE;
      }

      while (true){

          if(node.right == null && node.left != null){
              BinaryTreeNode result = findLargestItem(node);
          }

          if(node.right.right == null && node.right.left == null){
              return node.value;
          }
      }
  }

}


