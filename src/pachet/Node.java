package pachet;

public class Node {

    Integer number;
    Node leftChild;
    Node rightChild;

    Node(Integer number) {
        this.number = number;
        leftChild = null;
        rightChild = null;
    }

    public Node() {
        leftChild = null;
        rightChild = null;
        number = 0;
    }

    public String toString() {
        return "Number: " + number;
    }

    public void setLeftChild(Node n) {
        leftChild = n;
    }

    public void setRightChild(Node n) {
        rightChild = n;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setNumber(int n) {
        number = n;
    }

    public Integer getNumber() {
        return number;
    }
}
