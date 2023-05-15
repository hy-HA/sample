package arraystructure;
/*수도코드
 1. 배열의 0번째부터 배열의길이(n) -1 번째까지 인접한 두 수를 비교.
 2. 앞자리보다 뒷자리가 크면 스와핑한다
 3. 1회전은 배열의 0번째부터 배열의길이(n) -1 번째까지
 4. 마지막회는 배열의 0번째부터 n-1-(n-1)번째까지 탐색한다.
*/

//public class BubbleSort {
//    public void bubbleSort(int[] array) {
//        int lng = array.length;
//        for (int i = 0; i < lng - 1; i++) {
//            for (int j = 0; j < lng - 1 - i; j++) {
//                if (array[i] > array[i + 1]) {
//                    int temp = array[i + 1];
//                    array[i + 1] = array[i];
//                    array[i] = temp;
//                }
//            }
//        }
//    }
//}

public class BubbleSort {
    public void bubbleSort(int[] array) {
        int n = array.length;
        for(int j = 0; j< n-1;j++) {
            for (int i = 0; i < n - 1 - j; i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }
        }

    }
}