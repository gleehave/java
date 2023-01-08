package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Pos{
    int x, y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class swea_DFS_1247 {
    static int N;
    static Pos home;
    static Pos office;
    static Pos[] customer;
    static int min;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());

        for (int test = 1; test <= testNum; test++) {
            N = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split(" ");
            home = new Pos(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            office = new Pos(Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
            customer = new Pos[N];

            int idx = 0;
            for (int i = 4; i < 4 + N * 2; i += 2) {
                customer[idx++] = new Pos(Integer.parseInt(temp[i]), Integer.parseInt(temp[i + 1]));
            }

            min = Integer.MIN_VALUE;
            visited = new boolean[N];
            dfs(0, home.x, home.y, 0);
            System.out.println("#" + test + " " + min);
        }
        br.close();
    }

    public static void dfs(int k, int x, int y, int dist) {
        if(k==N){
            dist += getDistance(x, y, office.x, office.y);
            min = min > dist? dist: min;
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(k + 1, customer[i].x, customer[i].y, dist + getDistance(x, y, customer[i].x, customer[i].y));
                visited[i] = false;
            }
        }
    }

    public static int getDistance(int x, int y, int x2, int y2){
        return Math.abs(x - x2) + Math.abs(y - y2);
    }
}
