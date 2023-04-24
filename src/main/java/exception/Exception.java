package exception;

public class Exception {

    public static void main(String[] args){
        int[] number = {10,5,0};

        try {
            int index=1;
            int divisor = 0;

            int result = number[index] /divisor;
            System.out.println("Result"+result);
            return;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: 배열범위 벗어남");
        } finally {
            System.out.println("무조건 수행");
        }
    }
}
