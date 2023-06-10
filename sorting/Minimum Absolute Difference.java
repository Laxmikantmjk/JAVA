/*
Given an array of integers A, find and return the minimum value of | A [ i ] - A [ j ] | where i != j and |x| 
denotes the absolute value of x.
*/

public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        
        Arrays.sort(A);
        int ans = Integer.MAX_VALUE ;

        for(int i=0 ; i<N-1 ; i++){

            int temp = Math.abs(A[i] - A[i+1]);

            ans = Math.min(ans , temp);

        }

        return ans;
    }
}
