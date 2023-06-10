*/Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {

         int N = A.length;

         if(N==1){
             return 1;
         }

         HashSet<Integer>set = new HashSet<>();

         for(int i=0 ; i<N ; i++){
             set.add(A[i]);
         }

         
         int ans =1;

         for(int i=0 ; i<N ; i++){
             int count = 1;
             int X = A[i]-1;

             int Y = A[i]+1 ;

             while(set.contains(X) || set.contains(Y)){
                 if(set.contains(X)){
                        count++;
                        ans = Math.max(ans , count);
                        set.remove(X);
                        X--;

                 }
                 if(set.contains(Y)){
                     count++;
                        ans = Math.max(ans , count);
                        set.remove(Y);
                        Y++;
                 }
                 
                 
             }


             
         }

         return ans;
    }
}
