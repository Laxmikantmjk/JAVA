/*Find the Bth smallest element in given array A .

NOTE: Users should try to solve it in less than equal to B swaps.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {

        Arrays.sort(A);

        return A[B-1];
    }
}
