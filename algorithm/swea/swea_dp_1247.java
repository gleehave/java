package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Pos {
    int x, y;

    Pos(int x, int y) {
        this.x = x;
        this.y= y;
    }
}

public class swea_dp_1247 {
    static int N;
    static int[][] dp;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            Pos[] customer = new Pos[N + 2];
            customer[0] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            customer[N + 1] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            for (int i = 1; i <= N; i++) {
                customer[i] = new Pos(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            dist = new int[N + 2][N + 2];
            for (int i = 0; i < N + 1; i++) {
                for (int j = i + 1; j <= N + 1; j++) {
                    dist[i][j] = dist[i][j] = getDistance(customer[i].x, customer[i].y, customer[j].x, customer[j].y);
                }
            }

            dp = new int[1 << (N + 1)][N + 1];
            for (int i = 1; i < (1 << N + 1); i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }
            int min = TSP(0, 0);
            System.out.println("#" + tc + " " + min);
        }
        br.close();
    }

    private static int TSP(int visit, int now) {
        visit |= (1<<now);

        if(visit == (1<<(N+1))-1) return dist[now][N + 1];

        if(dp[visit][now] != Integer.MAX_VALUE) return dp[visit][now];

        for (int i = 0; i <= N; i++) {
            if (i != now && (visit & (1 << i)) == 0) {
                int temp = TSP(visit, i) + dist[now][i];
                if(dp[visit][now] > temp) dp[visit][now] = temp;
            }
        }
        return dp[visit][now];
    }

    public static int getDistance(int x, int y, int x2, int y2) {
        return Math.abs(x-x2) + Math.abs(y-y2);
    }
}
