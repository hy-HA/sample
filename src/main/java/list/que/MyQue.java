package list.que;

public class MyQue<T> {
    MyNode head;
    MyNode tail;
    int size=0;

    public static class MyNode{
        Object object;
        MyNode next;

        public MyNode(){}
        public MyNode(Object data){
            this.object=data;
            this.next=null;
        }

    }

    //큐의 끝에 새로운 요소를 추가한다.
    public void enqueue(T data){
        MyNode node = new MyNode(data);
//        System.out.println(node.object);
        size++;
        if (size==1){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            tail=node;

        }
    }
    //큐의 맨 앞 요소를 제거하고 반환한다.
    public T dequeue(){
        MyNode temp = head;
        Object result = temp.object;
        head=head.next;
        size--;
        return (T)result;
    }
    //큐의 맨 앞 요소 데이터를 반환한다 (제거하지 않음).
    public T peek(){
        MyNode node = new MyNode();
        return (T)head;

    }
    //큐의 크기(요소 수)를 반환한다.
    public int size(){
        return size;
    }
    //큐가 비어 있는지 확인한다.
    public boolean isEmpty(){
        return size==0;
    }
}
