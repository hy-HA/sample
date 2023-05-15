package binaryTree;

public class Btree {
    Node root;

    public static class Node{
        public Integer data;
        public Node left;
        public Node right;

        public Node(int data){
            this.data= data;
        }

    }

    //트리에 새로운 노드를 삽입한다.
    public void insert(int data) {
        root = insertRoot(root, data);
    }
    private Node insertRoot(Node root, int data){
            if(root == null) {
                root = new Node(data);
                return root;
            }
            if (data < root.data) {
                root.left = insertRoot(root.left,data);
            } else if (data > root.data ) {
                root = root.right;
            }
            return root;
    }


    //트리에서 지정된 데이터를 가진 노드가 있는지 확인한다.
    public boolean contains(int data){
        return check(root, data);

    }
    private boolean check(Node root,int data){
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        return root.data<data ? check(root.left,data) : check(root.right,data);
    }

    //트리에서 지정된 데이터를 가진 노드를 삭제한다.
    public void delete(int data){

    }
    //전위 순회(pre-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void preOrderTraversal(){

    }
    //중위 순회(in-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void inOrderTraversal(){

    }
    //후위 순회(post-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void postOrderTraversal(){

    }
}
