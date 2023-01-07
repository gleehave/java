package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_3234 {
    static int N, res;
    static int[] weight, sorted;
    static boolean[] isSelected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for (int T = 1; T <= tc; T++) {
            N = Integer.parseInt(br.readLine());
            weight = new int[N];
            sorted = new int[N];
            isSelected = new boolean[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                weight[i] = Integer.parseInt(st.nextToken());
            }

            res = 0;
            permutation(0);
            sb.append("#").append(" ").append(res).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }

    static void permutation(int cnt) {
        if (cnt == N) {
            scale(0, 0, 0);
        }
        for (int i = 0; i < N; i++) {
            if(isSelected[i]) continue;
            sorted[cnt] = weight[i];

            isSelected[i] = true;
            permutation(cnt + 1);
            isSelected[i] = false;
        }
    }

    static void scale(int cnt, int left, int right) {
        if(left < right) return;
        if (cnt == N) {
            res++;
            return;
        }
        scale(cnt + 1, left, right + sorted[cnt]);
        scale(cnt + 1, left + sorted[cnt], right);
    }
}
