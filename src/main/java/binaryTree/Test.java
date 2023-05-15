package binaryTree;

public class Test {
    Node root;

    public static class Node{
        public Integer data;
        public Node left;
        public Node right;

        public Node(int data){
            this.data= data;
        }

    }

    //Node로 return해야하는 이유
    public void insert(int data) {

        ifNullInsertOrCompare(root,data);
    }

    public void ifNullInsertOrCompare(Node root,int data){
        if(root == null){
            root.data = data;
        }
        if(root.data < data){
            ifNullInsertOrCompare(root.left,data);
        }else if (root.data > data) {
            ifNullInsertOrCompare(root.right,data);
        }
    }


}
