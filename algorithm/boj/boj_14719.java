/* 입력
4 4
3 0 1 4
 */

package algorithm.boj;

import java.io.IOException;
import java.util.Scanner;

public class boj_14719 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] block = new int[w];
        for (int i = 0; i < w; i++) {
            block[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 1; i < w; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left = Math.max(block[j], left);
            }

            for (int j = i + 1; j < w; j++) {
                right = Math.max(block[j], right);
            }

            if (block[i] < left && block[i] < right) {
                result += Math.min(left, right) - block[i];
            }
        }
        System.out.println(result);
    }
}
