/*Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.*/

public class Solution {

    public int[] arrayprint(int[]X , int A , int B){
        int ans[] = new int[B-A+1];
        int i=0;
        while(A<=B){
            ans[i] = X[A];
            i++;
            A++;

        }
        return ans;
    }
    public int[] solve(int[] A, int B) {
        int N = A.length;

        int i =0;
        int j=0;

        int sum = A[0];

        while(j<N){
            if(sum == B){
                return arrayprint(A , i , j);
                
            }
            if (sum <B){
                j++;
                if(j<N){
                    
                    sum = sum + A[j];
                }
                
            }
            else{
                sum = sum - A[i];
                i++;
            }
        }

        int Z[] = {-1};

        return Z ;
    }
}