package binaryTree;

public class BtreeGenericTest {
    public static void main(String[] args) {
        BtreeGeneric<String> btree = new BtreeGeneric<>();

        btree.insert("5");
        btree.insert("3");
        btree.insert("2");
        btree.insert("4");
        btree.insert("7");
        btree.insert("6");

        System.out.println(btree.contains("8"));

        btree.insert("8");

        System.out.println(btree.contains("8"));

    }
}
