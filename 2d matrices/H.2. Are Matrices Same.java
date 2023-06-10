/*

You are given two matrices A & B of equal dimensions and you have to check whether two matrices are equal or not.
*/

public class Solution {
    public int solve(int[][] A, int[][] B) {

        int N = A.length;
        int M = A[0].length;

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                if(A[i][j] != B[i][j]){
                    return 0;
                }
            }
        }

        return 1;
    }
}
