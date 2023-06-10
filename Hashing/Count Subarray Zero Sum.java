/*Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large, 
return the remainder on dividing the result with 109+7*/

public class Solution {
    public int solve(int[] A) {
        int N = A.length ;
        long []presum = new long[N];
        long sum = 0l ;
        long ans = 0l ;

        for(int i=0 ; i<N ; i++){
            sum = sum + A[i];
            presum[i]= sum ;
        } 

        HashMap <Long , Long> map = new HashMap <Long ,Long>();
         for(int i=0 ; i<N ; i++){
             if(map.containsKey(presum[i])){
                 long X = map.get(presum[i]);
                 ans = ans + X ;
                 X++;
                 map.put(presum[i] , X);
             }
             else{
                 map.put(presum[i] , 1l);
             }
         }

         
         for(int i =0 ; i<N ; i++){
            if(presum[i] == 0){
                ans++;
            }
        }
        ans = ans%(1000000007);
        return (int)ans ;

    }
}
