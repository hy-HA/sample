package Question;

public class Box<T>{
    public T content;

    //Box의 내용물이 같은지 비교
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return  result;
    }

    //public boolean compare(T other)
    //public boolean compare(Box other)
}
