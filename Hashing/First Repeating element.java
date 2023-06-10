/*Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1. */

public class Solution {
    public int solve(int[] A) {
        int N = A.length ;
         HashMap <Integer , Integer>map = new HashMap<Integer,Integer>();

         for(int i=0 ; i<N ; i++){
             if(map.containsKey(A[i])){
                 int X = map.get(A[i]);
                 X++;
                 map.put(A[i], X);
             }
             else{
                 map.put(A[i] ,1);
             }
         }

         for(int i=0 ; i<N ; i++){
             if(map.get(A[i]) > 1){
                 return A[i];
             }
         }
         return -1 ;
    }
}
