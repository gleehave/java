package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class swea_1247 {
    static int n;
    static XY start, end;
    static ArrayList<XY> point;
    static int[] v;
    static boolean[] select;
    static int res;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            n = Integer.parseInt(br.readLine());
            v = new int[n]; // 방문 표시할 int 배열
            select = new boolean[n];
            res = Integer.MAX_VALUE;// 최단거리를 구해야하므로 최댓값으로 초기화
            point = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            start = new XY(x, y);
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            end = new XY(x, y);
            for (int i = 0; i < n; i++) {
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                point.add(new XY(x, y)); // 추가하기
            }

            combi(start , 0, 0);

            sb.append("#").append(tc).append(" ").append(res).append("\n");

        }
        System.out.println(sb);
    }

    public static int cal_dist(XY a, XY b) {
        return (Math.abs(a.x - b.x) + Math.abs(a.y - b.y));
    }

    public static void combi(XY nowxy, int cnt, int sum) {
        if (cnt == n) {
            // 회사까지간거까지 해서 한번더 비교
            sum = sum + cal_dist(nowxy, end);
            res = Math.min(sum, res);
            return;
        }
        if (res <= sum)
            return;
        for (int i = 0; i < n; i++) {
            if (select[i]) //이미 선택되었다면 패스
                continue;

            select[i] = true;
            combi(point.get(i), cnt + 1, sum + cal_dist(nowxy, point.get(i)));
            select[i] = false;
        }
    }
}

class XY {
    int x;
    int y;

    public XY(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}