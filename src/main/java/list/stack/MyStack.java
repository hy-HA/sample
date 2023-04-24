package list.stack;

public class MyStack<T> {

    int size;
    Object[] list;

    public MyStack(){
        size=0;
        list = new Object[5];
    }

    //스택의 맨 위에 새로운 요소를 추가한다.
    public void push(T data){
        list[size]=data;
        size++;
    }

    //스택의 맨 위에 있는 요소를 제거하고 반환한다. 스택이 비어있는 경우, 예외를 발생시킨다.
    //throws는 왜?
    public T pop() throws NullException{
        if(size==0){
            throw new NullException("자료가 비어있습니다");
        }
        Object result = list[size-1];
        size--;
        return (T)result;
    }
    //스택의 맨 위에 있는 요소를 반환한다. 스택이 비어있는 경우, 예외를 발생시킨다.
    public T peek() throws NullException{
        if(size==0){
            throw new NullException("자료가 비어있습니다");
        }
        size--;
        return (T)list[size-1];

    }

    //스택의 크기(요소 수)를 반환한다.
    public int size(){
        return size;
    }

    //스택이 비어 있는지 확인한다.
    public boolean isEmpty(){
        return size==0;
    }
}

