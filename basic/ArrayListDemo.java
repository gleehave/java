package basic;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add(null);
        list.add("4");

        System.out.println(list);
        System.out.println(list.toString());

        list.add(0,"1-1");
        list.add(1, "java");
        System.out.println(list);

        list.remove("2");
        System.out.println(list);

        String strValue = list.get(2);
        System.out.println(strValue);
    }
}
