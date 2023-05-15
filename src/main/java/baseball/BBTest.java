package baseball;

public class BBTest {
    public static void main(String[] args) {
        BB bb = new BB();

        String result1 = bb.game(4,9,5);
        System.out.println(result1);
        String result2 = bb.game(1,2,5);
        System.out.println(result2);
        String result4 = bb.game(9,5,8);
        System.out.println(result4);
        String result5 = bb.game(9,5,8);
        System.out.println(result5);
        String result3 = bb.game(8,9,5);
        System.out.println(result3);
    }
}
