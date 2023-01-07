package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_3234 {
    static int T, N, res, arr[], weight[];
    static boolean used[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            res = 0;
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            weight = new int[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            used = new boolean[N];
            balances(0);
            System.out.println("#" + tc + " " + res);
        }
    }
    public static void balances(int cnt){
        if (cnt == N) {
            check(0, 0, 0);
            return;
        }

        for (int i = 0; i < N; i++) {
            if(used[i]) continue;
            used[i] = true;
            weight[cnt] = arr[i];
            balances(cnt + 1);
            used[i] = false;
        }
    }

    public static void check(int idx, int sumL, int sumR) {
        if (idx == N) {
            res++;
            return;
        }
        check(idx + 1, sumL + weight[idx], sumR);
        if (sumR + weight[idx] <= sumL) {
            check(idx + 1, sumL, sumR + weight[idx]);
        }
    }
}
