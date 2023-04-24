package list.que;

public class Test {
    public static void main(String[] args){
        MyQue<Integer> que = new MyQue<>();

        que.enqueue(1);
        que.enqueue(2);
        Integer q = que.dequeue();
        que.peek();
        Integer s = que.size();
        System.out.println(s);
        System.out.println(que.isEmpty());

    }
}
