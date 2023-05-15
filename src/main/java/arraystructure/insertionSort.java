package arraystructure;

/* 수도코드
1. 배열의 1번째부터 시작
2. 시작위치의 값을 temp에 저장
3. 시작위치의 값보다 시작위치 -1 번째 값이 큰 경우, 한칸 오른쪽으로 이동
4. 탐색과정은 시작위치부터 0번째까지 탐색.
5. 시작위치는 배열의 1번째부터 배열의 길이(n)-1번째까지 수행
 */

public class insertionSort {

//    public void insertionSort(int[] array) {
//        int n = array.length;
//        for(int i=1;i<n;i++){
//            int max=array[i];
//            int j = i-1;
//            while(j>=0 && array[j]>max){
//                array[j + 1] = array[j];
//                j = j - 1;
//            }
//        }
//    }
    public void insertionSort(int[] array) {
        int n = array.length;
        for(int i = 1; i < n-1; i++){
            for(int j = i; j>=0;j--){
                int temp = array[j];
                if(array[j]>temp){
                    array[j+1]=array[j];
                }
                // j의 위치의 값은 key보다 작다
                //array[j] = temp;
                array[j+1] = temp;
            }
        }
    }
}
