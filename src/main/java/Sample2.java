public class Sample2 {

    public static void main(String[] args) {
        //System.out.println(factorial(4));
        for(int i =2; i< 11; i++){
            System.out.println(fibonacci(i));
        }
        System.out.println(fibonacci(10));
    }

    public static int fibo(int x){
        if(x <= 2) return 1;
        return fibo(x-1)+(fibo(x-2));
    }

/*    public static int factorial(int x) {

        //0보다 작은수는 무한 증식
        if(x <= 1) return 1;

        //return을만나면 함수를 빠져나옴 => else 필요없음

        //int sum = 0;
        //sum += x*factorial(x-1);
        //return sum;

        return x*factorial(x-1);

    }

 */

    public static Long factorial(long n) {
        //1*2*3*...n-1*n
        long answer=1;
        for(int i=1; i<n+1;i++){
            answer *=i;
        }
        return answer;

    }

    public static long fibonacci(int n) {
        // 1 : 1
        // 2 : 1+1
        // 3 : 1+1+2
        // 4 : 1+1+2+3
        // 5 : 1+1+2+3+5
        // 1 1 2 3 5 8 ..
        if (n<=2) return 1;

        int answer = 0;
        //배열은 int로만 선언 가능?
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i=2;i<n;i++) {
            arr[i] = arr[i-1] + arr[i-2];
            answer = arr[i];
            }
        return answer;
    }

}
