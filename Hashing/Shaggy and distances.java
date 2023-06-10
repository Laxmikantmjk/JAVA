/*Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array a special if elements 
 * at those indices in the array are equal.

Shaggy wants you to find a special pair such that the distance between that pair is minimum. 
Distance between two indices is defined as |i-j|. 
If there is no special pair in the array, then return -1.*/

public class Solution {
    public int solve(int[] A) {

        int N = A.length;

        HashMap<Integer , Integer> map = new HashMap<>();

        int ans = Integer.MAX_VALUE ;

        for(int i=0 ; i<N ; i++){
            if(map.containsKey(A[i])){
                ans = Math.min(ans , (i - map.get(A[i])));
                map.put(A[i] , i);
            }
            else{
                map.put(A[i] , i);
                
            }
        }

        if(ans == Integer.MAX_VALUE ){
            return -1;
        }

        return ans;
    }
}
