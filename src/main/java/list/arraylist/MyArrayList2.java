package list.arraylist;

public class MyArrayList2<T> {

//    T[] tomato;
//    tomato = new T[100];

//    private static Object[] tomato;

    private int size;
    private T[] tomato;
    public MyArrayList2(){
        // this = tomato; > 클래스 타입변환 : 상속?
        size = 0;
        tomato = (T[]) new Object[5];
    }



    //어레이 리스트의 끝에 새로운 요소를 추가한다.
    public void add(T data) {

        int lng = tomato.length-1;
        boolean isNull = true;

        //값이 하나도 없는지 확인 => 인덱스 위치를 기억하는 변수로 대체
        for(int i=0;i<tomato.length;i++){
            if (tomato[i]!=null) {
                isNull = false;
            }
        }

        //값이 하나도 없는 경우
        if (isNull == true) {
            tomato[0] = data;

        //값이 꽉 차있는 경우
        } else if(tomato[lng]!=null){
            T[] newTomato= (T[]) new Object[lng*2];
            for(int i=0;i<tomato.length;i++){
                newTomato[i] = tomato[i];
            }
            //newTomato[lng] = data;
            tomato = newTomato;
        //값이 끝까지 안차있는 경우
        } else{
            int cnt = 0;
            int result;
            for( int i=0; i<tomato.length;i++){
                result = (tomato[i] == null) ? cnt : cnt++;

            }
            tomato[cnt] = data;
        }
        
    }

    //지정된 인덱스의 요소를 삭제하고, 삭제된 요소의 데이터를 반환한다
    public T remove(int index){
        return null;
    }

    //지정된 인덱스의 요소 데이터를 반환한다
    public T get(int index){
        return null;
    }

    //어레이 리스트의 크기(요소 수)를 반환한다.
    public int size(){
        return 0;
    }

    //어레이 리스트가 비어 있는지 확인한다.
    public boolean isEmpty(){

        for(int i=0;i<tomato.length;i++){
            if (tomato[i]!=null) return false;
        }
        return true;
    }
}



