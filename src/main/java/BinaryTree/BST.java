package BinaryTree;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by h3dg3wytch on 8/19/16.
 */
public class BST {

     public Node root;

    public boolean isEmpty(){
        return root == null;
    }

    public void addNode(Node node){

        if(root == null){
            root = node;
            return;
        }

        Node focusNode = root;
        Node parent;

        while(true){
            parent = focusNode;
            if(node.num < focusNode.num){
                focusNode = focusNode.left;
                if(focusNode == null){
                    parent.left = node;
                    return;
                }
            }else{
                focusNode = focusNode.right;
                if(focusNode == null){
                    parent.right = node;
                    return;
                }
            }
        }
    }

    public Node find(int key){

        if(isEmpty()) return null;

        Node focusNode = root;
        while (focusNode.num != key){
            if(key < focusNode.num){
                focusNode = focusNode.left;
            }else{
                focusNode = focusNode.right;
            }

            if(focusNode == null){
                break;
            }
        }
        return focusNode;
    }

    public boolean delete(int key){
        //Start at the top of the tree
        Node focusNode = root;
        Node parent = root;

        //WHen searching for a Node, this will tell us wther to search us either left or right
        boolean isItALeftChild = true;

        //find the node
        while(focusNode.num != key){
            if(key < focusNode.num){
                isItALeftChild = true;
                focusNode = focusNode.left;
            }else{
                isItALeftChild = false;
                focusNode = focusNode.right;
            }
            if(focusNode == null)
                return false;
        }

    }

    public void preOrderTraversal(Node focusNode){

        if(focusNode != null){
            System.out.println();
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }

    }

    public void inFixTraversal(Node focusNode){

        if(focusNode != null){
            inFixTraversal(focusNode.left);
            System.out.println(focusNode.num);
            inFixTraversal(focusNode.right);
        }
    }

    public void postOrderTraversal(Node focusNode){
        if(focusNode != null){
            postOrderTraversal(focusNode.left);
            postOrderTraversal(focusNode.right);
            System.out.println(focusNode.num);
        }
    }

}
