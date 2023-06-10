/*Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. 
 * Return the sum of those three integers.
Assume that there will only be one solution.*/

public class Solution {
    public int threeSumClosest(int[] A, int B) {

        int N = A.length;
        Arrays.sort(A);
        int dif = 1000000000;
        int ans=-1;

        for(int i=0 ; i<N ; i++){
            int j=i+1;
            int k=N-1;

            while(j<k){
                if(Math.abs(A[i]+A[j]+A[k]- B) < dif){
                    dif = Math.abs(A[i]+A[j]+A[k]- B);
                    ans = A[i] + A[j] + A[k];
                }

                if(A[i]+A[j]+A[k]>B){
                    k--;
                }
                else{
                    j++;
                }
            }


        }

        return ans;
 
    }
}