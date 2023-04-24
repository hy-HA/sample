package generic;

public class Generic {
    //타입 파라미터 T를 대체할 타입을 Number로 제한
    public static <T extends Number> boolean compare(T t1, T t2){

        // t1.getClass().getSimpleName() 와
        // t2.getClass().getSimpleName() 비교

        //Number의 메소드 사용
        double v1 = t1.doubleValue(); //Number 타입의 doubleValue() 메소드 사용
        System.out.println(v1);
        double v2 = t2.doubleValue(); //Number 타입의 doubleValue() 메소드 사용
        System.out.println(v2);
        return(v1==v2);

    }

    public static void main(String[] args){
        //제네릭 메소드 호출
        boolean result1 = compare(10,20);
        System.out.println(result1);

        //제네릭 메소드 호출
        boolean result2 = compare(4.5,4.5);
        System.out.println(result2);

    }
}
