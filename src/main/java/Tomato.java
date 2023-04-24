import java.util.ArrayList;
import java.util.List;

public class Tomato<T> {

    Object[] list;
    int pointer=0;



    public Tomato(){
        list = new Object[10];
    }

    //지정된 인덱스의 요소 데이터를 반환한다.
    public T get(int index) {
        return (T) list[index];
    }


    //어레이 리스트의 끝에 새로운 요소를 추가한다.
    public void add(T data){
        if (pointer == list.length-1){
            resize();
        }
        list[pointer]=data;
        pointer++;
    }

    private void resize() {
        Object[] newList = new Object[list.length*2];
        for(int i = 0 ; i< list.length;i++){
            newList[i] = list[i];
        }
        //list는 객체의 번지수를 가지고 있음
        //newList도 객체의 번지수를 가지고 있음
        list = newList;
    }

    //지정된 인덱스의 요소를 삭제
    public void remove(int index){
        if(index+1 == pointer){
            list[index]=null;
            pointer--;
        }
//        for(int i=index;i<pointer;i++){
        for(int i=index;i<pointer-1;i++){
            list[index]=list[index+1];
        }
        pointer--;
    }

    //어레이 리스트의 크기(요소 수)를 반환한다.
    public int size() {
        return pointer;
    }
    //어레이 리스트가 비어 있는지 확인한다.
    public boolean isEmpty(){
        return pointer == 0;
    }
    // 지정된 인덱스에 새로운 요소를 삽입한다.
    public void add(int index, T value) {
        if(index+1 == pointer){
            resize();
        }
        for(int i=pointer;i>index;i--){
            list[i] = list[i-1];
        }
        list[index]=value;
        pointer++;

    }


 }
