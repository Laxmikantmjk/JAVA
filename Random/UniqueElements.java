/*You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.

Find the minimum number of steps.

*/

public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        Arrays.sort(A);

        int ans =0;
        int max = A[0];

        for(int i=1 ; i<N ; i++){
           if(A[i] <= max ){
               max++;
               ans = ans + (max - A[i]);
               A[i] = max;   
               
        }
        max = A[i];
        }

        return ans;
    }
}