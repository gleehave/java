package algorithm.boj;

import java.util.Arrays;
import java.util.Scanner;

/*
입력
20
7
23
19
10
15
25
8
13
 */


public class boj_2309 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;
        int spyA = 0, spyB = 0;

        for (int i=0; i<heights.length; i++){
            heights[i] = sc.nextInt();
            sum += heights[i];
        }

        Arrays.sort(heights);

        for(int a=0; a<heights.length-1; a++){
            for(int b= a+1; b<heights.length; b++){
                if (sum - heights[a] - heights[b] == 100){
                    spyA = a;
                    spyB = b;
                    break;
                }
            }
        }
        
        for (int j = 0; j<heights.length; j++){
            if(j==spyA || j ==spyB){
                continue;
            }
            System.out.println(heights[j]);
        }
        sc.close();
    }
}
/*
출력
7
8
10
13
19
20
23
 */