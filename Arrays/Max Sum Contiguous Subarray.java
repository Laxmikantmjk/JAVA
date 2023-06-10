/*
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int ans = Integer.MIN_VALUE;
        int sum =0;

        for(int i=0 ; i<N ; i++){
            sum = sum + A[i];
            ans = Math.max(ans , sum);
            if(sum<0){
                sum =0;
            }

        }
        return ans;
    }
}
