public class Solution {
    public int solve(int[] A, int B) {

        int N = A.length;


        long ans[] = new long[B];

        for(int i=0 ; i<N ; i++){
            int k = A[i] %B ;
            ans[k] = ans[k] +1;
        }

        long X = 0l ; 

        int S1 =1;
        int S2 = B-1;

        while(S1<=S2){
            if(S1 != S2){
                 X = X + (ans[S1] * ans[S2])%1000000007 ;
            
            }
            else{
                X = X + ((ans[S1] * (ans[S2]-1))/2)%1000000007;

            }
            S1++;
            S2--;
           
        }
        
        X = X + ((ans[0] * (ans[0]-1))/2)%1000000007;

        return (int)X % (1000000007);
    }
}