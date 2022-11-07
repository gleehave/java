package basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();

        map.put("key1", "orange");
        map.put("key2", "apple");
        System.out.println(map.toString());

        map.put("key1", "Monkey");
        System.out.println(map.toString());

        String strValue = map.get("key2");
        System.out.println(strValue);
    }
}
