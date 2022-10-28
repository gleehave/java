package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("human");
        list.add("human");
        list.add("dog");
        list.add("fish");

        System.out.println(list.toString());

        list.add(0, "monkey");
        list.add(1, "bird");
        System.out.println(list);
    }
}
