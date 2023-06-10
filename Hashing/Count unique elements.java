/*You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.*/

public class Solution {
    public int solve(int[] A) {
        int N = A.length ;
        HashMap <Integer , Integer>map = new HashMap <Integer , Integer>();
        int ans = 0 ;

       /* for(int i=0 ;i<N ; i++){
            int count =0 ;
            for(int j=0 ; j<N ; j++){
                if(A[i] == A[j]){
                    count ++ ;
                }
                //map.put(A[i] , count) ;
            }
            if (count ==1){
                ans++;
            }
        }*/

        for(int i=0 ; i<N ;i++){
            if(map.containsKey(A[i])){
                int X = map.get(A[i]);
                X++;
                map.put(A[i],X);
            }
            else{
                map.put(A[i] , 1);
            }

        }

        for(int i=0 ; i<N ; i++){
            if(map.get(A[i]) == 1){
                ans++;
            }
        }

        return ans ;
    }
}
