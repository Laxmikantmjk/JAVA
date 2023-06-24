/*

Given a row-wise and column-wise sorted matrix A of size N * M.
Return the maximum non-empty submatrix sum of this matrix.
*/

public class Solution {
    public long solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        long SF[][] = new long[N][M];
        long ans = Integer.MIN_VALUE;

        for(int i=N-1 ; i>=0 ;i--){
            SF[i][M-1] = A[i][M-1];
            for(int j=M-2 ; j>=0 ; j--){
                SF[i][j] = SF[i][j+1] + A[i][j];
                //ans = Math.max(ans , SF[i][j]);
            }
        }

        for(int j=M-1 ; j>=0 ;j--){
            //SF[N-1][j] = SF[N-1][j];
            for(int i=N-2 ; i>=0 ; i--){
                SF[i][j] = SF[i+1][j] + SF[i][j];
                //ans = Math.max(ans , SF[i][j]);
            }
        }

        for(int i=0 ; i<N ; i++){
            for(int j =0 ; j<M ; j++){
                ans = Math.max(ans , SF[i][j]);
            }
        }

        return ans;
    }
}
