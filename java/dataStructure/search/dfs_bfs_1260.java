package dataStructure.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfs_bfs_1260 {

    static int N,M;
    static boolean[] visited;

    static boolean[] dfsVisited;
    static int [][] arr;

    static StringBuilder sbBfs = new StringBuilder();
    static StringBuilder sbDfs = new StringBuilder();

    static int[] dX = {-1, 0, 1, 0};
    static int[] dY = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        dfsVisited = new boolean[N+1];

        arr = new int[N+1][N+1];

        for (int i = 0 ; i< M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr[start][end] = 1;
            arr[end][start] = 1;
        }

        visited[v] = true;
        sbDfs.append(v).append(" ");
        dfs(v);
        System.out.println(sbDfs.toString());


        bfs(v);
        System.out.println(sbBfs.toString());

    }

    public static void dfs(int v){
      for(int i = 1 ; i <=N ; i++ ){
          if(arr[v][i] ==1 && !visited[i]){
              visited[i] = true;
              sbDfs.append(i).append(" ");
              dfs(i);
          }
      }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        dfsVisited[v] = true;
        sbBfs.append(v).append(" ");

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i =1; i<=N; i ++) {
                if(arr[node][i] == 1 && !dfsVisited[i]){
                    dfsVisited[i] = true;
                    sbBfs.append(i).append(" ");
                    q.add(i);
                }
            }
        }

    }
}
