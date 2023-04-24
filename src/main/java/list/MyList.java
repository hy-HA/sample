package list;

import java.util.List;

public interface MyList<T> {

    public T get(int index);



    public int size();

    public boolean isEmpty();


    public void add(T data);

    // 지정된 인덱스에 새로운 요소를 삽입한다.
    public void add(int index, T data);

    //링크드 리스트의 끝에 새로운 요소를 추가한다.
//    public abstract void add(Object data);

    // 지정된 인덱스의 요소를 삭제하고, 삭제된 요소의 데이터를 반환한다.
    public T remove(int index);


}
