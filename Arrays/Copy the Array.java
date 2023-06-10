/*
You are given a constant array A and an integer B.

You are required to return another array where outArr[i] = A[i] + B.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, int B) {
        int L = A.length ;
        int[]outarr = new int[L];
        for(int i=0 ; i<L ; i++){
            outarr[i] = A[i] + B ;
        }
        return outarr ;
    }
}
