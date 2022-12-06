package algorithm.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 2개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램

public class boj_2609 { 
    public static void main(String[] args) throws IOException{
        /*
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = gcd(a, b);

        System.out.println(d);
        System.out.println(a*b/d);
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
    }

    // 재귀함수로
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a % b);
    }

    // 반복문으로
    public static int gcd2(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
