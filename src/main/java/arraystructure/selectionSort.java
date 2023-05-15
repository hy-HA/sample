package arraystructure;
/* 수도코드
    1. 시작위치부터 n-1번째까지 최소값 탐색
    2. 최소값을 가진 index 발견하면 시작위치와 스와핑
    3. 시작위치를 다음 위치로 이동한 뒤, 1단게부터 반복
    4. 시작위치는 0번째부터 n-2번째까지

 */
public class selectionSort {
//    public void selectionSort(int[] array){
//        int n = array.length;
//
//        for (int i = 0; i<n-1;i++){
//            int minIndex = i;
//            for (int j = i+1; j<n;j++){
//                if(array[j]<minIndex){
//                    minIndex=j;
//                }
//                int temp = array[minIndex];
//                array[minIndex]=array[i];
//                array[i]=temp;
//            }
//        }
//    }

        public void insertionSort(int[] array) {
            int n = array.length;
            for(int i = 0; i<n; i++)
                for(int j = i ; j<n; j++){
                    int minIndex = 0;
                    if ( array[j] < array[i] ){
                        minIndex = j;
                }
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;

            }
        }
}
