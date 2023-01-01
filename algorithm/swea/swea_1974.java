package algorithm.swea;

import java.util.Scanner;

public class swea_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[][] map = new int[9][9];
            boolean flag = true;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[9];
                for (int j = 0; j < 9; j++) {
                    arr[(map[i][j]) - 1]++;
                }
                for (int k = 0; k < 9; k++) {
                    if (arr[k] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[9];
                for (int j = 0; j < 9; j++) {
                    arr[(map[j][i]) - 1]++;
                }
                for (int k = 0; k < 9; k++) {
                    if (arr[k] == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int[] arr = new int[9];
                    int r = i + 3;
                    int c = j + 3;
                    for (int k = i; k < r; k++) {
                        for (int l = j; l < c; l++) {
                            arr[(map[k][l]-1)]++;
                        }
                    }

                    for (int n = 0; n < 9; n++) {
                        if (arr[n] == 0) {
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if (flag == true) {
                System.out.printf("#%d %d\n", tc, 1);
            } else {
                System.out.printf("#%d %d\n", tc, 0);
            }
        }
    }
}
