/*Given an array of integers A of size N where N is even.

Divide the array into two subsets such that

1.Length of both subset is equal.
2.Each element of A occurs in exactly one of these subset.
Magic number = sum of absolute difference of corresponding elements of subset.

Note: You can reorder the position of elements within the subset to find the value of the magic number.

For Ex:- 
subset 1 = {1, 5, 1}, 
subset 2 = {1, 7, 11}
Magic number = abs(1 - 1) + abs(5 - 7) + abs(1 - 11) = 12
Return an array B of size 2, where B[0] = maximum possible value of Magic number modulo 109 + 7, 
B[1] = minimum possible value of a Magic number modulo 109 + 7.
*/


public class Solution {
    public int[] solve(int[] A) {

        int N = A.length;
        Arrays.sort(A);
        
        int mid = N/2;
        int i=0;
        int j=mid;
        int max = 0;

        int mod = 1000000007;

        while(i<mid && j<N){
            max = ((max%mod) + (Math.abs(A[i]-A[j]))%mod)%mod ;
              //max = ((max%mod) + (Math .abs(A[i]-A[j]))%mod)%mod ;
            //max = max %mod;
            i++;
            j++;
        }

        int min =0;

        for(int k=0 ; k<N ; k=k+2){
            min = (min + (Math.abs(A[k]-A[k+1])))%mod ;

        }

        //int max1 = (int)max 

        int ans[] = {max , min};

        return ans;


    }
}
