package algorithm.boj;

// 특정 조건이란 현재 캐릭터의 점수를 N이라고 할 때
// 점수 N을 자릿수를 기준으로 반으로 나누어
// 왼쪽 부분의 각 자릿수의 합과 오른쪽 부분의 각 자릿수의 합을 더한 값이 동일한 상황을 의미한다.

//  예를 들어 현재 점수가 123,402라면
//  왼쪽 부분의 각 자릿수의 합은 1+2+3,
//  오른쪽 부분의 각 자릿수의 합은 4+0+2이므로 두 합이 6으로 동일하여
//  럭키 스트레이트를 사용할 수 있다.

// 첫째 줄에 점수 N이 정수로 주어진다. (10 ≤ N ≤ 99,999,999)
// 단, 점수 N의 자릿수는 항상 짝수 형태로만 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj_18406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] n = br.readLine().toCharArray();
        int half = n.length / 2; // 반드시 짝수자릿수로 입력을 줌.

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n.length; i++) {
            if (i < half) {
                sum1 += n[i] - '0';
            } else {
                sum2 += n[i] - '0';
            }
        }

        if (sum1 == sum2) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
        br.close();
    }
}
