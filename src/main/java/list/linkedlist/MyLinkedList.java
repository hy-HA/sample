package list.linkedlist;

import list.MyList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyLinkedList<T> implements MyList<T> {

    List<Integer> list = new ArrayList<>();
        Node first;
        Node tail;

        int size;


    public static class Node{
            Object object;
            Node next;

            public Node(Object data){
                this.object=data;
                this.next=null;
            }
        }



    //링크드 리스트의 끝에 새로운 요소를 추가한다.
        @Override
        public void add(T data){
            Node newNode = new Node(data);
            size++;
            if(tail==null){
                first=newNode;
                tail=newNode;
            }else {
                tail.next=newNode;
                tail=newNode;
            }
//            if (size != 1){
//                MyLinkedList list = new MyLinkedList();
    //            //list묶음중에 검색이 되는게 맞나?
    //            //HEAP영역에 객체 생성되고, 번지수가 STACK의 변수에 참조됨
    //            //생성된 객체를 어떻게 찾아내서 연결?
    //            while(list.size==size-1){
    //                this.pre = list;
    //            }
    //            list.next=this;
//            }
        }



        //지정된 인덱스에 새로운 요소를 삽입한다.
        @Override
        public void add(int index, T data){
            if(index == 0){
                Node newNode = new Node(data);
                newNode.next = first;
                first = newNode;
                return;
            }

            Node currentNode = first;
            for(int i=0;i<index-1;i++){
                currentNode=currentNode.next;
            }
            Node temp2 = currentNode.next;
            Node newNode = new Node(data);
            currentNode.next=newNode;
            newNode.next=temp2;
//pre,next를 하면 바꿔야하는 양이 너무 많아진다
//바꾸려는 인덱스의 전단계만 알면된다.
//            first.object=data;
//            first.next.object=data;

        }

    //지정된 인덱스의 요소를 삭제하고, 삭제된 요소의 데이터를 반환한다.
        @Override
        public T remove(int index){
            Node temp1 = first;
            for(int i=0;i<index-1;i++){
                temp1=temp1.next;
            }
            Node temp2=temp1.next;
            Object result = temp2.object;
            temp2=temp2.next;
            temp1.next=temp2;
            return (T)result;
        }
        //지정된 인덱스의 요소 데이터를 반환한다.
        @Override
        public T get(int index){
            Node temp1 = first;
            for(int i=0;i<index;i++){
                temp1=temp1.next;
            }
            return (T)temp1.object;
        }
        //링크드 리스트의 크기(요소 수)를 반환한다.
        @Override
        public int size(){
            return size;
        }
        //링크드 리스트가 비어 있는지 확인한다.
        @Override
        public boolean isEmpty(){
            return tail == null;
        }
}
