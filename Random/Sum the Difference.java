/*Given an integer array, A of size N.
You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.*/

public class Solution {
    public long power(long A , int B , int C){
        long ans=1l;
        while(B>0){
            if(B%2==1){
                ans = (ans *A) % C;
            }
            B >>= 1;
            A = (A * A) % C;
        }
        return ans % C ;
    }
    public int solve(int[] A) {
        int N = A.length;
        int mod = 1000000007;

        Arrays.sort(A);
        //long  ans = 0l ;
        long plus =0l;
        long minus =0l;

        for(int i=0 ;i<N;i++){
            long X = power(2 , i , mod);
            long Y = power(2 , (N-i-1) , mod);
            plus += (A[i] *X)%mod;
            plus = plus%mod;
            minus += (A[i] * Y)%mod;
            minus = minus%mod;
        }

        //int Fans = (int)((plus-minus + mod)%mod);

        return (int)((plus - minus + mod) % mod);
    }
}