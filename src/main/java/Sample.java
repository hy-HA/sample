public class Sample {

    //프로그램 시작지점
    public static void main(String[] args) {
        main2();
//        System.out.println("Hello world");
//
//        for (int j = 1; j <= 5; j++) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print("-");
//            }
//        }

    }

    public static void main2() {

        for(int j=5; j>0; j--) {
            for(int i=j; i>0;i--) {
                System.out.print("-");
            }

            for(int i=0; i<(6-j);i++){
                System.out.print("*");
            }


            System.out.println("");
        }
    }
}