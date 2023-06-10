/*
There are N players, each with strength A[i]. 
when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). 
When a player's strength reaches zero, it loses the game, and the game continues 
in the same manner among other players until only 1 survivor remains.

Can you tell the minimum health last surviving person can have?

*/


public class Solution {
    public int gcd(int A, int B) {
        if(A==0 || B==0){
            return A+B;
        }
         
        return gcd(B%A , A);
    }

    
    public int solve(int[] A) {

        int N = A.length;
        if(N==1){
            return A[0];
        }

        int ans = gcd(A[0] , A[1]);

        for(int i=2 ; i<N ; i++){
            ans = gcd(A[i] , ans);
        }

    return ans;
    }
}
