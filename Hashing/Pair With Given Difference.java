/*Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.

Return 1 if any such pair exists else return 0.*/

public class Solution {
    public int solve(int[] A, int B) {
        int N = A.length;
         
         HashMap <Integer , Integer> map = new HashMap<Integer , Integer>();


         for(int i=0 ; i<N ; i++){
             if(map.containsValue(A[i])){
                 int X = map.get(A[i]);
                 X++;
                 map.put(A[i] , X);
             }
             else{
                 map.put(A[i] , 1);
             }
         }

         for(int i=0 ; i<N ; i++){
            if(A[i] == B + A[i] && map.get(A[i]) == 1){
                 return 0 ;
            }
            
            else if(map.containsKey(B + A[i])){
                 return 1 ;
             }
         }