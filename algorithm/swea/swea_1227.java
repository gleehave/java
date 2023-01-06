package algorithm.swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
100 * 100 행렬
벽 = 1 / 길 = 0 / 시작점 = 2, (1,1) / 도착점 = 3 (13, 13)
도달 가능 여부를 1 또는 0으로 표시한다 (1 - 가능함, 0 - 가능하지 않음).
*/

public class swea_1227 {
    static int[][] map;
    static int[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int find;
    static class Position{
        int x, y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int testCase = 1; testCase <= 10; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "");
            st.nextToken();

            Queue<Position> queue = new LinkedList<>();
            Position end = null;

            map = new int[100][100];
            visited = new int[100][100];
            find = 0;

            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine(), "");
                char[] charToint = st.nextToken().toCharArray();
                for (int j = 0; j < 100; j++) {
                    int temp = Character.getNumericValue(charToint[j]);
                    map[i][j] = temp;
                    if (temp == 2) {
                        queue.offer(new Position(i, j));
                    } else if (temp == 3) {
                        end = new Position(i, j);
                    }
                }
            }

            while (!queue.isEmpty()) {
                Position position = queue.poll();
                int x = position.x;
                int y = position.y;

                if (x == end.x && y == end.y) {
                    find = 1;
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    if ((0 <= x + dx[i] && x + dx[i] < 100 && 0 <= y + dy[i] && y + dy[i] < 100) && map[x + dx[i]][y + dy[i]] != 1 && visited[x + dx[i]][y + dy[i]] != 1) {
                        visited[x+dx[i]][y+dy[i]] = 1;
                        queue.offer(new Position((x + dx[i]), y + dy[i]));
                    }
                }
            }
            System.out.printf("#%d %d\n", testCase, find);

        }
    }
}

/*
public class swea_1227 {
    static int[][] map;
    static int[][] visited; // 여기서 new int[100][100]; 이걸 하면 계속 메모리를 쓰는건가?
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
            map = new int[100][100];
            visited = new int[100][100];
            int start_x = 1;
            int start_y = 1;

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            DFS(start_x, start_y);
            System.out.println("#"+tc+" "+find);
        }
    }
}
*/