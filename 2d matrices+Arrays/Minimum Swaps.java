/*
Given an array of integers A and an integer B, find and return the minimum number of swaps 
required to bring all the numbers less than or equal to B together.

Note: It is possible to swap any two elements, not necessarily consecutive.

*/

public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;

        int count =0;
        for(int i=0 ; i<N ; i++){
            if(A[i] <= B){
                count++;
            }
        }


        int ans=0;
        for(int i=0 ; i<count ; i++){
            if(A[i] >B){
                ans++;
            }
        }
        int finans = ans ;

        for(int i=count ; i<N ; i++){
            if(A[i]>B){
                ans++;
            }
            if(A[i-count]>B){
                ans--;
            }

            finans = Math.min(ans , finans);
        }

        return finans ;
    }
}
