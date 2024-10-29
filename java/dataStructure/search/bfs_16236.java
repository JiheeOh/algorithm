package dataStructure.search;

import java.io.*;
import java.util.*;
import static java.util.stream.Collectors.toList;

/**
 * 아기 상어
 */
public class bfs_16236 {


    static int[][] arr;
    static int sharkX, sharkY, N;
    static int sharkSize = 2;

    static int[] dRow = {-1, 0, 1, 0};
    static int[] dCol = {0, -1, 0, 1};

    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 9) {
                    sharkX = i;
                    sharkY = j;
                    arr[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        int result = moveShark(sharkX, sharkY);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int moveShark(int sharkX, int sharkY) {
        int result = 0;
        int eatCnt = 0;

        while (true) {
            int time = 0;

            Queue<Node> q = new LinkedList<>();
            q.add(new Node(sharkX, sharkY, time));


            // 먹을 수 있는 고기 찾기
            List<Node> eatableFish = new ArrayList<>();
            while (!q.isEmpty()) {
                Node node = q.poll();

                for (int i = 0; i < 4; i++) {
                    int next_x = node.x + dRow[i];
                    int next_y = node.y + dCol[i];
                    int next_time = node.time + 1;

                    if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= N) {
                        continue;
                    }
                    if (visited[next_x][next_y]) {
                        continue;
                    }

                    visited[next_x][next_y] = true;

                    if (arr[next_x][next_y] <= sharkSize) {
                        if (arr[next_x][next_y] < sharkSize && arr[next_x][next_y] > 0) {
                            eatableFish.add(new Node(next_x, next_y, next_time));
                        }
                        q.add(new Node(next_x, next_y, next_time));
                    }
                }
            }

            // 먹을게 없어
            if (eatableFish.isEmpty()) {
                break;
            }

            // 우선순위의 물고기를 찾아
            List<Node> eatList = eatableFish.stream().sorted(Comparator.comparing(Node::getTime).thenComparing(Node::getX)).collect(toList());
            Node eat = eatList.get(0);

            // 냡냡
            arr[eat.x][eat.y] = 0;
            eatCnt += 1;

            // 상어 이동
            sharkX = eat.x;
            sharkY = eat.y;

            // 크기도 증가 시켜
            if (eatCnt == sharkSize) {
                sharkSize += 1;
                eatCnt = 0;
            }

            // 방문 초기화
            visited = new boolean[N][N];

            result += eat.time;
        }
        return result;
    }

    public static class Node {
        int x;
        int y;

        int time;

        public int getX() {
            return x;
        }

        public int getTime() {
            return time;
        }

        public Node(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}



