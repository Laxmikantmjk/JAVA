/*Given two arrays of integers A and B, Sort A in such a way that the relative order among 
 * the elements will be the same as those are in B.
For the elements not present in B, append them at last in sorted order.

Return the array A after sorting from the above method.

NOTE: Elements of B are unique.*/

public class Solution {
    public int[] solve(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;

        Arrays.sort(A);

        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

        for(int i=0 ;i<N ; i++){
            if(map.containsKey(A[i])){
                int X = map.get(A[i]);
                X++;
                map.put(A[i] , X);
            }
            else{
                map.put(A[i] , 1);
            }
        }

        int index =0;

        int ans[] = new int[N];

        for(int i =0 ; i<M ; i++){
            if(map.containsKey(B[i])){
                int Z = map.get(B[i]);
                while(Z>0){
                    ans[index] = B[i];
                    Z--;
                    index++;
                }

                map.remove(B[i]);
            }
        }


        for(int i=0 ; i<N ; i++ ){
             if(map.containsKey(A[i])){
                int Z = map.get(A[i]);
                while(Z>0){
                    ans[index] = A[i];
                    Z--;
                    index++;
                }
                map.remove(A[i]);
        }
        }

        return ans;

    }
}
