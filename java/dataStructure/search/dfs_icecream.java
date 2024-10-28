package dataStructure.search;


import java.io.*;
import java.util.StringTokenizer;

/**
 * 음료수 얼려먹기
 * [이것이 코딩테스트다] 149p
 */
public class dfs_icecream {
    static int[][] arr;

    static int N, M;
    static int[] dX = {-1, 1, 0, 0};
    static int[] dY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] text = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(text[j]);
            }
        }

        // 모든 노드에 대하여 음료수 채우기
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (pour(i, j)) {
                    result += 1;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean pour(int x, int y) {
        // 주어진 범위를 벗어나는 경우 즉시 종료
        if (x <= -1 || y <= -1 || x >= N || y >= M) {
            return false;
        }

        // 방문하지 않은 경우
        if (arr[x][y] == 0) {
            //방문 처리
            arr[x][y] = 1;

            // 상,하,좌,우 호출
            pour(x + dX[0], y + dY[0]); // 상에있는 노드와 인접한 모든 노드 탐색
            pour(x + dX[1], y + dY[1]);
            pour(x + dX[2], y + dY[2]);
            pour(x + dX[3], y + dY[3]);
            return true;

        }
        return false;
    }


}
