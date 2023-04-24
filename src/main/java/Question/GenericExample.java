package Question;

public class GenericExample {
    public static void main(String[] args){
        Box box1 = new Box();
        box1.content="100";

        Box box2 = new Box();
        box2.content="100";

        Box box3 = new Box();
        box3.content=100;

        boolean result1 = box1.compare(box2);

    }
}
