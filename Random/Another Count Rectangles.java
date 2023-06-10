/*Given a sorted array of distinct integers A and an integer B, 
 * find and return how many rectangles with distinct configurations can be created using elements of this array as length and breadth 
 * whose area is lesser than B.

(Note that a rectangle of 2 x 3 is different from 3 x 2 if we take configuration into view)*/

public class Solution {
    public int solve(int[] A, int B) {

        int N = A.length;

        int i=0;
        int j=N-1;
        long count=0l;

        while(i<N && j>=0){
            long prod = ((long)A[i] * (long)A[j]);
            

            if(prod <B){
                count = (count + j+1)%1000000007;
                i++;
            }
            else if (prod >=B){
                j--;
            }
            
        }
        int ans = (int)(count);

        return ans;
    }
}