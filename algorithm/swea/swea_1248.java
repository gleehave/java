package algorithm.swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_1248 {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static int T;
    private static int V, E, a, b;
    private static int size;
    private static Node[] nodes;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            nodes = new Node[V + 1];
            visited = new boolean[V + 1];
            for (int i = 1; i <= V; i++) {
                nodes[i] = new Node(i);
            }
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < E; i++) {
                int parent = Integer.parseInt(st.nextToken());
                int child = Integer.parseInt(st.nextToken());
                if (nodes[parent].leftChildIdx == 0) {
                    nodes[parent].leftChildIdx = child;
                } else {
                    nodes[parent].rightChildIdx = child;
                }
                nodes[child].parentIdx = parent;
            }

            int commonParent = 1;
            while (true) {
                if (a != 1) {
                    int parent = nodes[a].parentIdx;
                    if (visited[parent]) {
                        commonParent = parent;
                        break;
                    }
                    visited[parent] = true;
                    a = parent;
                }
                if (b != 1) {
                    int parent = nodes[b].parentIdx;
                    if (visited[parent]) {
                        commonParent = parent;
                        break;
                    }
                    visited[parent] = true;
                    b = parent;
                }
            }
            size = 0;
            get(nodes[commonParent]);
            sb.append("#").append(tc).append(" ").append(commonParent).append(" ").append(size).append("\n");
        }
        System.out.println(sb);
    }

    static void get(Node node) {
        size++;
        if (node.leftChildIdx != 0) get(nodes[node.leftChildIdx]);
        if (node.rightChildIdx != 0) get(nodes[node.rightChildIdx]);
    }

    private static class Node {
        int data;
        int parentIdx, leftChildIdx, rightChildIdx;

        Node(int data) {
            this.data = data;
            this.parentIdx = 0;
            this.leftChildIdx = 0;
            this.rightChildIdx = 0;
        }
    }

}
