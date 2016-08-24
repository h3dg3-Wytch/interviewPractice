package BinaryTree;

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

//    public boolean delete(int key){
//        //Start at the top of the tree
//        Node focusNode = root;
//        Node parent = root;
//
//        //WHen searching for a Node, this will tell us wther to search us either left or right
//        boolean isItALeftChild = true;
//
//        //find the node
//        while(focusNode.num != key && focusNode != null){
//
//            parent = focusNode;
//
//            if(key < focusNode.num){
//                isItALeftChild = true;
//                focusNode = focusNode.left;
//            }else{
//                isItALeftChild = false;
//                focusNode = focusNode.right;
//            }
//            if(focusNode == null)
//                return false;
//        }
//
//        if(focusNode == null){
//            return false;
//        }
//
//        if(focusNode.left == null && focusNode.right == null){
//
//            if(focusNode == root){
//                root = null;
//            }else if(isItALeftChild){
//                parent.left = null;
//            }else{
//                parent.right = null;
//            }
//
//        }else if(focusNode.right == null){
//            if(focusNode == root){
//                root = focusNode.left;
//            }else if(isItALeftChild){
//                parent.left = focusNode.left;
//            }else{
//                parent.right = focusNode.left;
//            }
//        }else if(focusNode.left == null){
//            if(focusNode == root){
//                root = focusNode.right;
//            }else if(isItALeftChild){
//                parent.left = focusNode.right;
//            }else{
//                parent.right = focusNode.right;
//            }
//        }else{
//            Node replacement = getReplacementNode(focusNode);
//            if(focusNode == root){
//                root = replacement;
//            }else if(isItALeftChild){
//                parent.left = replacement;
//            }else{
//                parent.right = replacement;
//            }
//            replacement.left = focusNode.left;
//        }
//        return true;
//    }


    private boolean remove(int key){
        Node parent = root;
        Node focusRoot = root;

        boolean isItALeftChild = true;

        while (focusRoot.num != key){
            parent = focusRoot;
            if(key < focusRoot.num){
                isItALeftChild = true;
                focusRoot = focusRoot.left;
            }else{
                isItALeftChild = false;
                focusRoot = focusRoot.right;
            }
            if(focusRoot == null){
                return false;
            }
        }

        if(focusRoot.left == null && focusRoot.right == null){
            if(focusRoot == root){
                root = null;
            }else if(isItALeftChild){
                parent.left = null;
            }else{
                parent.right = null;
            }
        }else if(focusRoot.right == null){
            if(focusRoot == root){
                root =  focusRoot.left;
            }else if(isItALeftChild){
                parent.left = focusRoot.left;
            }else{
                parent.right = focusRoot.left;
            }
        }else if(focusRoot.left == null){
            if(focusRoot == root){
                root = focusRoot.right;
            }else if(isItALeftChild){
                parent.left = focusRoot.right;
            }else{
                parent.right = focusRoot.right;
            }
        }else{
            Node replacementNode = getReplacementNode(focusRoot);
            if (focusRoot == root){
                root = replacementNode;
            }else if(isItALeftChild){
                parent.left = replacementNode;
            }else{
                parent.right = replacementNode;
            }
            replacementNode.left = focusRoot.right;
        }
        return true;
    }

    private Node getReplacementNode(Node replacedNode) {
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;

        Node focusNode = replacement.right;
        while(focusNode != null){
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.left;
        }
        if(replacement != replacedNode.right){
            replacementParent.left = replacement.right;
            replacement.right = replacementParent.right;
        }
        return  replacement;
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