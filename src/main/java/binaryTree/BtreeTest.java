package binaryTree;

public class BtreeTest {
    public static void main(String[] args) {
        Btree btree = new Btree();
        btree.insert(10);
        System.out.println(btree.root.data);
        btree.insert(12);
        System.out.println(btree.root.right.data);
    }
}
