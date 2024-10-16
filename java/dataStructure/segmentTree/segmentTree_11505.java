package dataStructure.segmentTree;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 구간 곱 구하기
 */
public class segmentTree_11505 {

    static int MOD = 1000000007;
    static long [] arr, tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 배열과 트리 생성
        arr = new long[n+1];

        for(int i= 1; i<=n ; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        tree = new long[n*4];
        initTree(1,1,n);

        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j< m+k; j++){

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 1){
                updateTree(1,1,n,b,c);
            }else if(a ==2) {
                sb.append(findTree(1, 1, n, b, c)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }




    private static long initTree(int node, int start, int end) {
        // leaf node
        if(start == end) {
            return tree[node] = arr[start];
        }

        int mid = (start+end)/2;
        long leftValue = initTree(node*2,start,mid);
        long rightValue = initTree(node*2+1,mid+1,end);

        return tree[node] = (leftValue*rightValue)%MOD;
    }

    private static void updateTree(int node, int start, int end, int idx, int value) {
        // 구간 밖에 있을 경우
        if(start > idx || end < idx){
            return;
        }

        // leaf node 일 경우
        if(start==idx && end ==idx) {
            tree[node] = value;
            return;
        }

        // leaf node 변경시 부모노드도 변경됨
        int mid = (start+end) /2;
        updateTree(node*2,start,mid,idx,value);
        updateTree(node*2+1,mid+1,end,idx,value);

        tree[node] = (tree[node*2] * tree[node*2+1])%MOD;

    }

    private static long findTree(int node, int start, int end, int left, int right) {
        // 구간 밖에 있을 경우
        if(start > right || end < left){
            return 1;
        }

        // 구간 안에 있을 경우
        if(start >=left && end <= right) {
            return tree[node];
        }

        // 구간이 걸쳐져있을 경우
        int mid = (start +end) /2;
        long leftValue = findTree(node*2,start,mid,left,right);
        long rightValue = findTree(node*2+1,mid+1,end,left,right);

        return leftValue*rightValue%MOD;
    }


}
