package algorithm.boj;

// 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 ..
// 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.

import java.util.ArrayList;
import java.util.Scanner;

// 3 7 입력: 시작과 끝을 나타냄
// 15 출력
// 12 23334 44455555 인덱스가 1부터 시작해서 3-7구간
public class boj_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<1000; i++){
            for (int j=0; j<=i; j++){
                list.add(i+1);
            }
        }

        int result = 0;
        for (int i=A-1; i<=B-1; i++){
            result += list.get(i);
        }

        System.out.println(result);
    }
}
