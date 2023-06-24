/*
You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B.
*/

public class Solution {
    public int[][] solve(int[][] A, int B) {

        int N = A.length;
        int M = A[0].length;

        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<M ; j++){
                A[i][j] = B * A[i][j];
            }
        }

        return A;
    }
}
