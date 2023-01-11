package algorithm.boj;

import java.util.Scanner;

public class boj_1316 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();
//        System.out.println(str); // 문자가 찍힘(e.g., happy)
//        System.out.println("check: " + check); // 주소값 들어있음.

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);
            System.out.println("now: " + now); // a 문자이면, 97이 출력됨.

            if (prev != now) {
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }
}
