package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args){
        String[] arr = {"1", "2", "3"};

        for (String item: arr){
            System.out.println(item);
        }

        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        for (String item: list){
            System.out.println(item);
        }
    }
}
