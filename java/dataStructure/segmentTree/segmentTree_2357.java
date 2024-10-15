package dataStructure.segmentTree;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 구간 최솟값, 최댓값 구하기
 */
public class segmentTree_2357 {
    static int[] arr ,minTree, maxTree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[n+1];

        for(int i = 1 ; i <= n ; i ++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        minTree = new int[n*4];
        maxTree = new int[n*4];

        initMinTree(1,n,1);
        initMaxTree(1,n,1);

        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i< m; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(findMin(1,n,1,a,b)+" ");
            sb.append(findMax(1,n,1,a,b)+"\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static int findMin(int start, int end, int node, int left, int right) {
        // 범위 밖에 있을 경우
        if(start>right || end <left ){
            return Integer.MAX_VALUE;
        }
        // 범위 안에 있을 경우
        if (start >=left && end <=right){
            return minTree[node];
        }

        int mid = (start+end) /2;
        int leftValue = findMin(start,mid,node*2,left,right);
        int rightValue = findMin(mid+1, end, node*2+1,left,right);
        return Math.min(leftValue,rightValue);
    }

    private static int findMax(int start, int end, int node, int left, int right) {
        // 범위 밖에 있을 경우
        if(start>right || end <left ){
            return Integer.MIN_VALUE;
        }
        // 범위 안에 있을 경우
        if (start >=left && end <=right){
            return maxTree[node];
        }

        int mid = (start+end) /2;
        int leftValue = findMax(start,mid,node*2,left,right);
        int rightValue = findMax(mid+1, end, node*2+1,left,right);
        return Math.max(leftValue,rightValue);
    }


    private static int initMinTree(int start, int end, int node) {
        // leaf node
        if (start == end) {
            return minTree[node] = arr[start];
        }

        int mid = (start+end)/2 ;
        int leftValue = initMinTree(start,mid,node*2);
        int rightValue = initMinTree(mid+1, end, node*2+1);
        return minTree[node]= Math.min(leftValue,rightValue);
    }

    private static int initMaxTree(int start, int end, int node) {
        // leaf node
        if (start == end) {
            return maxTree[node] = arr[start];
        }

        int mid = (start+end)/2 ;
        int leftValue = initMaxTree(start,mid,node*2);
        int rightValue = initMaxTree(mid+1, end, node*2+1);
        return maxTree[node]= Math.max(leftValue,rightValue);
    }


}
