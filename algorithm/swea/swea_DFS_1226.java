package algorithm.swea;

import java.util.Scanner;

// 1은 벽, 0은 길
// 2는 출발점, 3은 도착점

public class swea_DFS_1226 {

    static int[][] map;
    static int[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int find;

    public static void DFS(int x, int y) {
        if (find == 1) {return;}
        if(map[x][y] == 3){
            find = 1;
            return;
        }

        visited[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < 16 && 0 <= ny && ny < 16) {
                if (visited[nx][ny] == 0 && map[nx][ny] != 1) {
                    DFS(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = 1; t <= 10; t++) {
            int tc = sc.nextInt();
            map = new int[16][16];
            visited = new int[16][16];

            int x = 0;
            int y = 0;
            find = 0;

            for (int i = 0; i < 16; i++) {
                String s = sc.next(); // 왜 여기서?
                for (int j = 0; j < 16; j++) {
                    map[i][j] = s.charAt(j) - '0'; // 이건 그냥 아스키코드네
                    if (map[i][j] == 2) { // 인덱스 저장... 개빡치네
                        x = i;
                        y = j;
                    }
                }
            }
            DFS(x, y);
            System.out.println("#"+t+" "+find);
        }
    }
}