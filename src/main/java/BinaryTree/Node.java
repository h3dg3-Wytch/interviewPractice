package BinaryTree;

/**
 * Created by h3dg3wytch on 8/19/16.
 */
public class Node {

    int num;
    Node left;
    Node right;

    public Node(){}

    public Node(int num){
        this.num = num;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

}
