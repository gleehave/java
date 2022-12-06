package algorithm.boj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class boj_2693 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<t;i++){
            list.clear();
            for (int j=0; j<10; j++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.println(list.get(7));
        }
    }
}
