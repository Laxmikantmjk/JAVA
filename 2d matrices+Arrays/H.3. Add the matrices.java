/*
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.

*/

public class Solution {
    public int[][] solve(int[][] A, int[][] B) {

        int N = A.length;
        int M = A[0].length;

        int ans[][] = new int[N][M];

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                ans[i][j] = A[i][j] + B[i][j];
            }
        }

        return ans;
    }
}
