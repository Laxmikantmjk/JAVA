/*
given a vector A of non negative integers representing an elevation map
where the width of each bar is 1, compute how much water it is able to trap
after raining.
*/
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int N = A.length;

        
        int[]maxL = new int[N];
        int ML = A[0];
        for(int i= 0; i<N ; i++){
            ML = Math.max(ML , A[i]);
            maxL[i] = ML;
        }

        int[]maxR = new int[N];
        int MR = A[N-1];
         for(int i= N-1; i>=0 ; i--){
            MR = Math.max(MR , A[i]);
            maxR[i] = MR;
        }

        int minH[] = new int[N];
        for(int i=0 ; i <N ; i++){
            minH[i] = Math.min(maxL[i] , maxR[i]);
        }

        int ans =0;

        for(int i=0 ; i<N ; i++){
            ans = ans + (minH[i] - A[i]);
        }
        return ans;

    }
}