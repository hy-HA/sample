package binaryTree;

public class BtreeGeneric <T extends Comparable<T>> {
    Node root;

    public class Node<T extends Comparable<T>> {
        public T data;
        public Node left;
        public Node right;

        public Node(T data) {
            this.data = data;
        }

    }

    //트리에 새로운 노드를 삽입한다.
    public void insert(T data) {
        root = insertRoot(root, data);
    }

    private Node insertRoot(Node root, T data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data.compareTo((T) root.data) < 0) {
            root.left = insertRoot(root.left, data);
        } else if (data.compareTo((T) root.data) > 0) {
            root.right = insertRoot(root.right, data);
        }
        return root;
    }


    //트리에서 지정된 데이터를 가진 노드가 있는지 확인한다.
    public boolean contains(T data) {
        return check(root, data);

    }

    private boolean check(Node root, T data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        return data.compareTo((T) root.data) < 0 ? check(root.left, data) : check(root.right, data);
    }

    //트리에서 지정된 데이터를 가진 노드를 삭제한다.
    public void delete(T data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, T data) {
        if (root.data == null) {
            return root;
        }
        if (data.compareTo((T) root.data) < 0) {
            root.left = deleteRec(root.left, data);
        } else if (data.compareTo((T) root.data) > 0) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //TODO 왜?
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, (T) root.data);

        }
        return root;
    }

    private T minValue(Node root) {
        T minValue = (T) root.data;
        while (root.left != null) {
            minValue = (T) root.left.data;
            root = root.left;
        }
        return minValue;
    }

    //전위 순회(pre-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void preOrderTraversal () {
        preOrderTraversalRec(root);
    }

    //TODO 윗 단계로 어떻게 거슬러올라가지? > 그럼 전에는 왜 Node로 return?
    private void preOrderTraversalRec (Node root){
        if(root != null){
            System.out.println(root.data+" ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }
    //중위 순회(in-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void inOrderTraversal () {
        inOrderTraversalRec(root);

    }

//    private Node inOrderTraversalRec(Node root) {
//        if(root.left != null){//1
//            inOrderTraversalRec(root.left);
//            if (root.right != null){
//                System.out.println(root.data);
//                inOrderTraversalRec(root.right);
//        }
//        if (root.right != null){
//            System.out.println(root.data);
//
//            return root;
//        }
//        System.out.println(root.data);
//        return root;
//    }
    private void inOrderTraversalRec(Node root) {
        if(root != null){
            inOrderTraversalRec(root.left);
            System.out.println(root.data);
            inOrderTraversalRec(root.right);
        }

    }

    //후위 순회(post-order traversal)를 사용하여 트리의 모든 노드를 출력한다.
    public void postOrderTraversal () {
        postOrderTraversalRec(root);

    }

    private void postOrderTraversalRec(Node root) {
        if(root != null){
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.println(root.data);

        }
    }

}



