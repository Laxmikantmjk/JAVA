/*Given n non-negative integers A[0], A[1], ..., A[n-1] , where each represents a point at coordinate (i, A[i]).

N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).

Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.*/

public class Solution {
    public int maxArea(int[] A) {

        int N = A.length;
        int i=0;
        int j=N-1;

        int ans = 0;

        while(i<N && j>=0){
            ans = Math.max(ans ,Math.min(A[i] , A[j])*(j-i) );
            if(A[i]< A[j]){
                i++;
            }
            else if(A[i] > A[j]){
                j--;
            }
            else{
                i++;
                j--;
            }
        }

        return ans;
    }
}