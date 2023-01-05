package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class swea_BFS_1226 {
    static int N = 16;
    static char[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 1; t <= 10; t++) {
            int test = Integer.parseInt(br.readLine());
            queue = new LinkedList<Pair>();
            arr = new char[N][N];

            for (int i = 0; i < N; i++) {
                String str = br.readLine();
                for (int j = 0; j < N; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            System.out.print("#" + test + " ");
            BFS(1,1);
        }
    }

    public static void BFS(int x, int y) {
        queue.offer(new Pair(x, y));
        arr[x][y] = '1';

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int curX = current.x + dx[i];
                int curY = current.y + dy[i];

                if (arr[curX][curY] == '0') {
                    queue.offer(new Pair(curX, curY));
                    arr[curX][curY] = '1';
                }
                if (arr[curX][curY] == '3') {
                    System.out.println("1");
                    return;
                }
            }
        }
        System.out.println("0");
    }
}
