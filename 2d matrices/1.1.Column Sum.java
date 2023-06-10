/*
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
*/

public class Solution {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int ans[] = new int[M];

        for(int j=0 ; j<M ; j++){
            int temp =0;
            for(int i=0 ; i<N ; i++){
                temp = temp + A[i][j];
            }
            ans[j]=temp;
        }

        return ans;
    }    
}
