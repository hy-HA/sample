package list.arraylist;

public class MyArrayList<T> {

    Object[] data;
    int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }


    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void add(T value) {
        if (size == data.length) {
            resize();
        }

        data[size] = value;
        size++;
    }

    // 지정된 인덱스에 새로운 요소를 삽입한다.
    public void add(int index, T value) {
        if (size == data.length) {
            resize();
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = value;
        size++;
    }

    // 지정된 인덱스의 요소를 삭제하고, 삭제된 요소의 데이터를 반환한다.
    public T remove(int index) {
        Object a = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return (T)a;

    }


    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

}
