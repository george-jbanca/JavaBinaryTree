package pachet;

public class Main {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(2);
        bt.insert(1);
        bt.insert(21);
        bt.insert(222);
        bt.insert(6);
        bt.insert(7);
        bt.insert(9);
        bt.insert(90);
        bt.insert(76);
        bt.insert(45);
        bt.insert(33);
        bt.insert(0);
        bt.insert(99);
        bt.insert(33);
        bt.insert(71);
        System.out.println(bt.isEmpty());
        System.out.println(bt.search(5));
        System.out.println(bt.search(2));
        System.out.println(bt.search(3));
        System.out.println(bt.countNodes());
        bt.inOrder();
        System.out.println(bt.getHeight());
    }

}
