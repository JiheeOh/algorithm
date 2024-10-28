package dataStructure.search;

import java.io.*;
import java.util.*;

/**
 * 아기 상어
 */
public class bfs_16236 {
    static int[][] arr;
    static int sharkX,sharkY,N;
    static int sharkSize =2;

    static int[] dRow = {-1,0,1,0};
    static int[] dCol = {0,-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i=0 ; i< N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0; j< N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] ==9){
                    sharkX = i;
                    sharkY = j;
                    arr[i][j] =0;
                }
            }
        }

        int result = moveShark(sharkX,sharkY);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int moveShark(int sharkX, int sharkY) {
        int result = 0 ;

        while (true)
        {
            int eatCnt = 0 ;
            int time = 0 ;

            Queue<Node> q  = new LinkedList<>();
            q.add(new Node(sharkX,sharkY,time));


            // 먹을 수 있는 고기 찾기
            List<Node> eatableFish = new ArrayList<>();
            while(!q.isEmpty()){
                Node node = q.poll();
                boolean [][] visited = new boolean[N][N];

                time +=1;
                for (int i = 0 ; i<4; i++){
                    int next_x = node.x+dCol[i];
                    int next_y = node.y+dRow[i];

                    if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= N){
                        continue;
                    }
                    if (visited[next_x][next_y]){
                        continue;
                    }

                    visited[next_x][next_y] = true;

                    if(arr[next_x][next_y] <= sharkSize){
                        if(arr[next_x][next_y] < sharkSize  && arr[next_x][next_y] > 0){
                            eatableFish.add(new Node(next_x,next_y,time));
                        }
                        q.add(new Node(next_x,next_y,time));
                    }
                }
            }

            // 먹을게 없어
            if(eatableFish.isEmpty()){
                break;
            }

            // 우선순위의 물고기를 찾아
            // 먹어,
            // 초기화도 시켜
            // 상어 위치 설정
            // 크기도 증가 시켜


            result += time ;
        }


        return result;
    }

    public static class Node{
        int x ;
        int y;

        int time;

        public Node(int x, int y, int time){
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
}


