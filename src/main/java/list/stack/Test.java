package list.stack;

public class Test {

    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();
        list.push(1);
        Integer i = list.pop();
        System.out.println(i);
//        Integer t = list.pop();
//        System.out.println(t);
        boolean b = list.isEmpty();
        System.out.println(b);
        }

}
