/*
You are given a matrix A, you have to return another matrix which is the transpose of A.

NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row. 
The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index, and the element at (j, i)th index to (i, j)th index.

*/

public class Solution {
    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int ans[][] = new int[M][N];

        for(int i=0 ; i<N ; i++){
            for(int j=0 ;j<M; j++){
                
                ans[j][i] = A[i][j];
             
            }
        }

        return ans;
    }
}
