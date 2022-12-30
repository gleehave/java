package algorithm.swea;

import java.util.Scanner;

public class swea_1961 {
    public static int[][] Rotation(int[][] arr){
        int[][] result = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int[][] degree_90 = Rotation(arr);
            int[][] degree_180 = Rotation(degree_90);
            int[][] degree_270 = Rotation(degree_180);

            System.out.printf("#%d\n", tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(degree_90[i][j]);
                }
                System.out.print("");

                for (int j = 0; j < N; j++) {
                    System.out.print(degree_180[i][j]);
                }
                System.out.print("");

                for (int j = 0; j < N; j++) {
                    System.out.print(degree_270[i][j]);
                }
                System.out.println();
            }
        }
    }
}
