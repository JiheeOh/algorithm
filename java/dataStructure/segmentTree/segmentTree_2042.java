package dataStructure.segmentTree;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 구간 내 합 구하기
 */
public class segmentTree_2042 {
    static long[] arr,tree;


    /**제한
     *
     *  입력되는 수 2^63승까지 처리해야함 -> int로만 처리하면 범위 초과 발생, long 까지 처리
     **/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 구간 합 구하는 트리는 1부터 시작하는 게 좋다.
        // node index 처리할 때 곱하기 2하면 바로 왼쪽 하위 노드이기 때문
        arr = new long[N+1];
        for (int i =1 ; i <= N; i++){
            // 배열 입력값이 2의 63승이 들어올 수 있으니 long 타입으로 받아야한다.
            arr[i] = Long.parseLong(br.readLine());
        }

        /**
         * 세그먼트 트리 size 구하는 법
         * 2^k >= N인 최소의 k의 제곱을 구해야한다.
         * k > = logN/log2
         * (logN/log2)의 값 올림 후 +1 = k
         */
        int k = (int) Math.ceil(Math.log(N) / Math.log(2) ) +1 ;
        int size= (int) Math.pow(2,k);

        tree = new long[size];

        // 세그먼트 트리 생성
        init(1,N,1);

        StringBuilder sb = new StringBuilder();
        for (int i =0; i < M+K; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            if(a ==1) {
                update(1,N,1,b,c);
            }else if ( a ==2) {
                sb.append(sum(1,N,1,b, (int) c) +"\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static long init(int start, int end, int node) {
        // leaf node
        if( start == end) {
            return tree[node] = arr[start];
        }

        int mid = (start+end) /2;
        return tree[node] = init(start,mid,node*2) + init(mid+1 ,end,node*2+1);
    }

    private static long sum(int start, int end, int node, int left, int right){
        // 구간 밖에 있는 경우
        if (start > right || end < left) {
            return 0;
        }

        // 구간 안에 있는 경우
        if (start >= left && end <= right){
            return tree[node];
        }

        // 구간에 걸쳐 있는 경우
        int mid = (start+ end) / 2;
        return sum(start,mid,node*2,left,right) + sum(mid+1, end, node*2+1,left,right);
    }

    private static void update(int start, int end, int node, int idx,long value) {
        // 범위 밖에 있는 경우
        if (start > idx || end < idx) {
            return;
        }

        // 리프노드
        if(start==idx && idx == end ) {
            tree[node] = value;
            return;
        }

        //리프노드 변경시 부모 노드 변경
        int mid = (start+end) /2;
        update(start,mid,node*2,idx,value);
        update(mid+1, end, node*2+1, idx, value);
        tree[node] = tree[node*2] + tree[node*2+1];
    }
}