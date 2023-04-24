package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        String[] strings = new String[10];
        Object[] objs = new Object[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            strings[i] = "NUM:"+i;
        }

//        genericPrint(numbers);
//        genericPrint(strings);


//      Integer max = findMax(numbers);
//        Integer max2 = findMax(objs);   //-> 에러 발생(T[]타입이 필요하나 Object[]가 들어왔다)
//        Integer max3 = findMax(strings); //-> integer가 필요하나 string이 들어왔다
//reason: no instance(s) of type variable(s) T exist so that Object conforms to Comparable<T>
//        no instance(s) of type variable(s) exist so that String conforms to Integer
//        System.out.println(max2);
    }

    public static <T> void genericPrint(T[] items) {
        for (T item : items) {
            System.out.println(item + " ");
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> T findMax(T[] items) {
        T maxItem = items[0];
        for (T item : items) {
            if (item.compareTo(maxItem) > 0) {
                maxItem = item;
            }
        }
        return maxItem;
    }

    public void teest(){
        List<?> listobj = null;
        List<String> liststr = null;

        //listobj = (List<Object>)liststr;
        liststr = (List<String>)listobj;
    }
}
