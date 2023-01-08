package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Position{
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class swea_1249 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n;
    static int min;

    static int[][] map;
    static int[][] ans;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        for (int test = 1; test <= testNum; test++) {
            n = Integer.parseInt(br.readLine());

            map = new int[n][n];
            for (int i = 0; i < n; i++) {
                String[] temp = br.readLine().split("");
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(temp[j]);
                }
            }

            min = Integer.MIN_VALUE;
            visited = new boolean[n][n];

            ans = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(ans[i], Integer.MAX_VALUE);
                ans[0][0] = 0;

                bfs(0, 0);
                System.out.println("#"+test+" "+min);
            }
            br.close();
        }
    }

    public static void bfs(int x, int y) {
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x, y));
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            Position pos = queue.poll();
            int a = pos.x;
            int b = pos.y;

            if (a == n - 1 && b == n - 1) {
                min = min > ans[n - 1][n - 1] ? ans[n - 1][n - 1] : min;
            }

            if (min <= ans[a][b]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];
                if (isValidPosition(nx, ny)) {
                    if (!visited[nx][ny] || ans[nx][ny] > ans[a][b] + map[nx][ny]) {
                        visited[nx][ny] = true;
                        ans[nx][ny] = ans[a][b] + map[nx][ny];
                        queue.offer(new Position(nx, ny));
                    }
                }
            }

        }
    }

    private static boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= n) {return false;}
        return true;
    }

}
