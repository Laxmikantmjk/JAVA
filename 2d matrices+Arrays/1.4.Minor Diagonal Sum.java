/*
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int N = A.length;

        int sum = 0;

        int i=0 ; 
        int j =N-1;

        while(i<N && j>=0){
            sum = sum+A[i][j];
            i++;
            j--;
        }

        return sum;
    }
}
