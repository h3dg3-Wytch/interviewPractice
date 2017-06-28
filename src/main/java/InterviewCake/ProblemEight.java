package InterviewCake;

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

        public boolean superBalanced(BinaryTreeNode node){

            if(node.left != null && node.right!= null){
                if(node.right.value - node.left.value == 1){
                    superBalanced(node.right);
                    superBalanced(node.left);
                }else{
                    return false;
                }
            }else if(node.left == null && node.right != null){
                return false;
            }else if(node.right == null && node.left != null){
                return false;
            }

            return true;
        }
    }
}
