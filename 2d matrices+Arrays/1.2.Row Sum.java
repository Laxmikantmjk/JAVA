/*
You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
*/

public class Solution {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int ans[] = new int[N];

        for(int i=0 ; i<N ; i++){
            int temp =0;
            for(int j=0 ; j<M ; j++){
                temp = temp+A[i][j];
            }
            ans[i] = temp;
        }

        return ans;
    }
}
