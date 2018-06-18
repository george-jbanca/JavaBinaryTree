package pachet;

public class Main {

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(2);
        bt.insert(1);
        System.out.println(bt.isEmpty());
        System.out.println(bt.search(5));
        System.out.println(bt.search(2));
        System.out.println(bt.search(3));
        System.out.println(bt.countNodes());
        System.out.println(bt.getHeight());
    }

}
