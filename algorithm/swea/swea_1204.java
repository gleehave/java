package algorithm.swea;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int caseNum = sc.nextInt();
            int[] count = new int[101];

            for (int i = 0; i < 1000; i++) {
                int s = sc.nextInt();
                count[s]++;
            }

            int max = Arrays.stream(count).max().getAsInt();
            int result = 0;

            for (int i = count.length-1; i > 0; i--) {
                if (count[i] == max) {
                    result = i;
                    break;
                }
            }
            System.out.println("#"+caseNum+ " "+result);
        }
    }
}
