package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// 양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾아라.


public class boj_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] binary = new String[n];
        System.out.println("binary: "+binary);


        for (int i=0; i<n; i++){ // 테스트 케이스 만큼 for문 
            Integer num = sc.nextInt(); //n입력

            String tmp = "";

            while (num != 1){
                tmp += num % 2;
                // System.out.println("tmp type: "+ tmp.getClass().getName());
                num = num / 2;
                // System.out.println("num type: "+ num.getClass().getName());
            }
            tmp = tmp + num;
            binary[i] = tmp;
            System.out.println("binary 추가 "+Arrays.toString(binary));
        }
        
        for (String tmp: binary){
            for (int i=0; i< tmp.length(); i++){
                if (tmp.charAt(i)=='1'){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
