package algorithm.swea;

import java.util.Scanner;

public class swea_1959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] a = new int[N];
            int[] b = new int[M];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                b[i] = sc.nextInt();
            }

            int max = 0;
            if (N < M) {
                for (int i = 0; i <= M - N; i++) {
                    int result = 0;
                    for (int j = 0; j < N; j++) {
                        result += a[j] * b[i + j];
                    }
                    max = Math.max(max, result);
                }
            }

            if (N > M) {
                for (int i = 0; i < N - M + 1; i++) {
                    int result = 0;
                    for (int j = 0; j < M; j++) {
                        result += a[i + j] * b[j];
                    }
                    max = Math.max(max, result);
                }
            }

            if (N == M) {
                int result = 0;
                for (int i = 0; i < N; i++) {
                    result += a[i] * b[i];
                }
                max = Math.max(max, result);
            }
            System.out.printf("#%d %d\n", tc, max);
        }
    }
}



