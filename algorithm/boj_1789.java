// 수들의 합
// 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은?
package algorithm;

import java.util.Scanner;

public class boj_1789{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        long sum = 0;
        int count = 0;

        for (int i=1; ; i++){
            if (sum > num) break;
            sum += i;
            // System.out.println("original: "+count);
            // System.out.println("original++: "+count++);
            count++;
        }

        System.out.println(count-1);

        sc.close(); // scanner는 반드시 close 해줄 것!
    }
}