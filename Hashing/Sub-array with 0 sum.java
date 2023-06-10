/*Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.*/

public class Solution {
    public int solve(int[] A) {

        int N = A.length;

        long []presum = new long[N];
        long sum = A[0];
        presum[0] =sum;

        for(int i=1 ; i<N ; i++){
            sum = sum + A[i];
            presum[i] = sum;             
        }


        HashSet<Long>set = new HashSet<>();

        for(int i=0 ; i<N ; i++){
            if(presum[i] ==0){
                return 1;
            }
            else if(set.contains(presum[i])){
                return 1;
            }
            else{
                set.add(presum[i]);
            }
        }

        return 0;
    }
}
