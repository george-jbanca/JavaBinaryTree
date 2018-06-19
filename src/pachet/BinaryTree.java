package pachet;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Integer number) {
        root = insert(root, number);
    }

    public Node insert(Node node, Integer number) {
        if (node == null) {
            node = new Node(number);
        } else {
            if (node.getRightChild() == null) {
                node.rightChild = insert(node.rightChild, number);
            } else node.leftChild = insert(node.leftChild, number);
        }
        return node;
    }

    public Integer countNodes() {
        return countNodes(root);
    }

    private Integer countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            int k = 1;
            k += countNodes(node.getLeftChild());
            k += countNodes(node.getRightChild());
            return k;
        }
    }

    //  Inorder traversal of the tree;
    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            System.out.println(node.getNumber() + " ");
            inOrder(node.getRightChild());
        }
    }

    //  Preorder traversal;
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getNumber() + " ");
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    //    Postorder traversal;
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.println(node.getNumber() + " ");
        }
    }

    public boolean search(Integer numberToSearch) {
        return search(root, numberToSearch);
    }

    private boolean search(Node node, Integer numberToSearch) {
        if (node.getNumber() == numberToSearch) {
            return true;
        }
        if (node.getLeftChild() != null) {
            if (search(node.getLeftChild(), numberToSearch)) return true;
        }
        if (node.getRightChild() != null) {
            if (search(node.getRightChild(), numberToSearch)) return true;
        }
        return false;
    }

    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int counter = 1;
            counter += getHeight(node.getLeftChild());
            counter += getHeight(node.getRightChild());
            return counter;
        }
    }

}