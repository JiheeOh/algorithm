package dataStructure.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 미로 탈출
 * [이것이 코딩테스트다] 153p
 */
public class bfs_maze {
    static int[][] arr;
    static int[] dX = {-1, 1, 0, 0};
    static int[] dY = {0, 0, -1, 1};

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] data = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(data[j]);
            }
        }

        int result = movePerson(0, 0);

        System.out.println(result);
        br.close();
    }

    private static int movePerson(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.x;
            y = node.y;

            for (int i = 0; i < 4; i++) {
                int next_x = x + dX[i];
                int next_y = y + dY[i];

                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= M) {
                    continue;
                }
                if (arr[next_x][next_y] == 1) {
                    arr[next_x][next_y] = arr[x][y] + 1;
                    queue.add(new Node(next_x, next_y));
                }
            }
        }
        return arr[N - 1][M - 1];
    }

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
