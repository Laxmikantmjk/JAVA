/*
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {

        int N = A.length;

        int sum=0;
        int i=0;

        while(i<N){
            sum = sum + A[i][i];
            i++;
        }

        return sum;
    }
}
