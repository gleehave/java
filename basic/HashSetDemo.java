package basic;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args){
        Set<String> hashSet = new HashSet<String>();

        hashSet.add("Human");
        hashSet.add("Dog");
        hashSet.add("Fish");
        hashSet.add("human");
        System.out.println(hashSet.toString()); //hashSet의 원소 순서는 보장하지 않음.

        boolean isExist = hashSet.contains("Human");
        System.out.println(isExist);

        hashSet.remove("Human");
        System.out.println(hashSet.toString());
    }
}
