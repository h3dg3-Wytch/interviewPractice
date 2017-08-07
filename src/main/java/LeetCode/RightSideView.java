package LeetCode;


import java.util.*;

/**
 * Created by h3dg3wytch on 8/3/17.
 */
public class RightSideView {

    public static void main(String[] args) {
    }
    public class TreeNode {
      int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
     }

    public static class TreeNodeDept{

        TreeNode node;
        int depth;

        TreeNodeDept(TreeNode node, int depth){

            this.node = node;
            this.depth = depth;

        }
    }



    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Set<Integer> depths = new HashSet<>();
        Stack<TreeNodeDept> stack = new Stack();

        stack.push(new TreeNodeDept(root, 0));

        while(!stack.isEmpty()){

            TreeNodeDept nodeDept = stack.pop();

            TreeNode node = nodeDept.node;
            int depth = nodeDept.depth;

            if(!depths.contains(depth)){
                result.add(node.val);
                depths.add(depth);
            }

            if(node.right != null){
                stack.push(new TreeNodeDept(node, depth + 1  ));
            }

            if(node.left != null){
                stack.push(new TreeNodeDept(node,depth + 1));
            }

            

        }
        return result;

    }
}
