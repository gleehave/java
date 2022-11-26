package algorithm;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// N개의 정수가 주어진다. 최소 최대를 구하라.

// 5
// 20 10 35 30 7

public class boj_10818 {
    public static void main(String[] args) throws IOException{
        /*
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr); // 오름차순으로 정렬.
        System.out.print(arr[0] + " " + arr[N-1]);
         */

         /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[N-1]);
         */

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         int N = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

         int index = 0;
         int[] arr = new int[N];
         while(st.hasMoreTokens()){
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
         }

         Arrays.sort(arr);
         System.out.println(arr[0]+" "+arr[N-1]);
    }
}

/* 
 * parseInt()
 * String타입의 숫자를 int타입으로 변환해주는 함수.
 * 
 * parse는 int뿐만 아니라 다양한 타입들을 지원한다.
 * Byte.parseByte();
 * Short.parseShort();
 * Integer.parseInt();
 * Long.parseLong();
 * Float.parseFloat();
 * Double.parseDouble();
*/
