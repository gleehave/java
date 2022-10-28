package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("human");
        hashSet.add("dog");
        hashSet.add("Fish");

        boolean is_Exist = hashSet.contains("human");
        System.out.println(is_Exist);

        hashSet.remove("human");
        System.out.println(hashSet.toString());
    }
}
