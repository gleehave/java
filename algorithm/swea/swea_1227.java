package algorithm.swea;

import java.util.Scanner;

/*
100 * 100 행렬
벽 = 1 / 길 = 0 / 시작점 = 2, (1,1) / 도착점 = 3 (13, 13)
도달 가능 여부를 1 또는 0으로 표시한다 (1 - 가능함, 0 - 가능하지 않음).
*/
public class swea_1227 {
    static int[][] map = new int[100][100];
    static int[][] visited = new int[100][100];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int find;

    public static void DFS(int x, int y) {
        if (find == 1) {
            return;
        }
        if (x == 13 && y == 13) {
            find = 1;
            return;
        }

        visited[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            if (0 <= new_x && new_x < 100 && 0 <= new_y && new_y < 100) {
                if (visited[new_x][new_y] != 1 && map[new_x][new_y] != 1) {
                    DFS(new_x, new_y);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            int T = sc.nextInt();
            int start_x = 1;
            int start_y = 1;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            DFS(start_x, start_y);
        }
    }
}
