/*Given an array A. You have some integers given in the array B.

For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.*/

public class Solution {
    public int[] solve(int[] A, int[] B) {
        int N =A.length;
        int Q = B.length;
        HashMap<Integer,Integer>map = new HashMap<Integer ,Integer>();

        for(int i=0 ; i<N ; i++){
            if(map.containsKey(A[i])){
                int X = map.get(A[i]);
                X++;
                map.put(A[i] , X);
            }
            else{
                map.put(A[i] , 1);
            }
        }

        int ans[] = new int[Q];
        for(int i=0 ; i<Q ; i++){
            if(map.containsKey(B[i])){
                ans[i] = map.get(B[i]);
            }
            else{
                ans[i] =0 ;
            }
        }

        return ans ;

        
    }
}
