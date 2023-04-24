package list.linkedlist;

import java.util.stream.Stream;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
//⚠️        Stream<Integer> stream = list.stream();
//⚠️        stream.forEach(t->list.add(int i...));

        // [1,2,3,4,5,6,7,8,9,10]

        list.add(0, 9999);

        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        for(int i = 0; i< list.size(); i++){
            list2.add(list.get(i));
        }

    }
}
