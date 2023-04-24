public class Sample4 {

    class Solution_평균구하기 {

        public double solution(int[] arr) {
            double answer = 0;
            double sum = 0;

            for(int num : arr){
                sum += num;
            }

            answer = sum/arr.length;

            return answer;
        }
    }

    class Solution_두정수사이의합 {
        public long solution(int a, int b) {
            long answer = 0;

            if (a == b) {
                return a;
            } else if (a < b) {
                for (int i = a; i < b + 1; i++) {
                    answer += i;
                }
            } else {
                for (int i = b; i < a + 1; i++) {
                    answer += i;
                }
            }
            return answer;

        }
    }

    class Solution_x만큼간격 {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            for (int i = 0; i < n; i++) {
                answer[i] = x * (i + 1);
            }

            return answer;
        }
    }

    // 	626331 > 488이 나옴
    class Solution_콜라츠 {
        public int solution(int num) {
            long n = (long)num;
            int answer = 0;
            int cnt = 0;

            if (num == 1) return 0;

            while (num != 1){

                if (num%2 == 0) {
                    num = num/2;
                } else {
                    num = num*3+1;
                }

                cnt++;
                if (cnt==500) return -1;
            }
            return cnt;
        }
    }
}
