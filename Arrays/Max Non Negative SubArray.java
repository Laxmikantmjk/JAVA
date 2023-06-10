/*
Given an array of integers, A of length N, find out the maximum sum sub-array of non negative numbers from A.

The sub-array should be contiguous i.e., a sub-array created by choosing the second and 
fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array.

Find and return the required subarray.

NOTE:

    1. If there is a tie, then compare with segment's length and return segment which has maximum length.
    2. If there is still a tie, then return the segment with minimum starting index

*/

public class Solution {
    public int[] maxset(int[] A) {
        long ans =Integer.MIN_VALUE;
        int N = A.length;
        long sum=0;
        int L=-1;
        int R=-1;
        int S1=0;
        int S2=0;
        while(S2<N){
            if(A[S2] < 0){
                S2 = S2+1;
                S1 = S2;
                sum = 0;
                continue;
            }
            sum = sum + A[S2];
            if(sum >ans){
                ans =sum;
                L=S1;
                R=S2;
            }
            else if(sum == ans){
                if(R-L <S2-S1){
                    L=S1;
                    R=S2;
                }
            }
            S2++;
        }
        if(L==-1){
            return new int[0];
        }
        int ansarr[] = new int[R-L+1];
        for(int i=L ;i<=R;i++){
            ansarr[i-L] = A[i];
        }
        return ansarr;
    }
}