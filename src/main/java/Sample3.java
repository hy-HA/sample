import java.util.*;

public class Sample3 {

    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new TreeMap<>();

        map.put("apple",3);
        map.put("banana",5);
        map.put("cherry",2);

        System.out.println(map.get("banana"));
    }


}
