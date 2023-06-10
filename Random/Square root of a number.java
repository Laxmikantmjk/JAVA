/*Given a number A. Return square root of the number if it is perfect square otherwise return -1. */

public class Solution {
    public long solve(int A) {
        for(long i= 1l ; i*i<=A ; i++){
            if(i*i ==A){
                return i;
            }
        }
        return -1 ;
        
    }
}