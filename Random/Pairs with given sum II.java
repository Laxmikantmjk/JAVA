/*Given a sorted array of integers (not necessarily distinct) A and an integer B, 
 * find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).*/

public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;

        HashMap<Integer , Integer>map = new HashMap<Integer, Integer>();

        int count=0;
        int mod = 1000000007;

        for(int i=0 ; i<N ; i++){

            int a =A[i];
            int b = B - a;
            

            if(map.containsKey(b)){
                count = (count + map.get(b))%mod;
            }

            if(map.containsKey(a)){
                int X = map.get(a);
                X++;
                map.put(a , X);
            }
            else{
                map.put(a , 1);
            }

        }

        return count % mod;
    }
}
