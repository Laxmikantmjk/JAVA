/*You are given an array A of N integers. You will have to return number of distinct elements of the array.
*/

public class Solution {
    public int solve(int[] A) {
        int N = A.length ;
        HashSet <Integer> set = new HashSet<Integer>();
        for(int i=0 ; i <N ; i++){
            set.add(A[i]);
        }

        return set.size();
    }
}
