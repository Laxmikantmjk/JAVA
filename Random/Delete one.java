/*
Given an integer array A of size N. 
You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.
Find the maximum value of GCD.
*/


public class Solution {

    public int gcd(int A , int B){
        if(A==0){
            return B;
        }
        if(B==0){
            return A;
        }
         
         return gcd(B%A , A);
    }

    public int solve(int[] A) {
        int N = A.length;

        int SufGCD[] = new int[A.length];
        int PreGCD[] = new int[A.length];
         SufGCD[N-1] = A[N-1];
         PreGCD[0] = A[0];

         //PreGCD array
        for(int i=1 ; i<N ; i++){
             PreGCD[i] = gcd(A[i] , PreGCD[i-1]);
        }

        for(int i=N-2 ; i>=0 ; i--){
             SufGCD[i] = gcd(A[i] , SufGCD[i+1]);
        }

        int ans =1;

        for(int i=0 ; i<N ; i++){
            if(i==0){
                ans = Math.max(ans, SufGCD[i+1]);
            }

            else if(i==N-1){
                ans = Math.max(ans, PreGCD[i-1]);
            }
            else{
                ans = Math.max(ans , gcd(SufGCD[i+1] , PreGCD[i-1]));
            }

        }

        return ans;
    }
}
