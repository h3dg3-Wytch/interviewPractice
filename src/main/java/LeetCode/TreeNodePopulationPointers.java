package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by h3dg3wytch on 8/4/17.
 */
public class TreeNodePopulationPointers {

    public class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
    }


    public void connect(TreeLinkNode root){

        if( root == null){
            return;
        }

        Queue<TreeLinkNode> treeLinkNodeQueue = new PriorityQueue<>();
        treeLinkNodeQueue.add(root);

        int depth = 0;
        TreeLinkNode currentNodeToAddNextToo = root;
        while (!treeLinkNodeQueue.isEmpty()){

            TreeLinkNode node = treeLinkNodeQueue.poll();

            while ((int)Math.pow(2, depth) > 0){
                currentNodeToAddNextToo.next = node;
                currentNodeToAddNextToo = node.next;



            }

            if(node.left != null){

            }



        }
    }


}
