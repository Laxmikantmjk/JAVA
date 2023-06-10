/*
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order. */

public class Solution {
    public int[] solve(int[] A, int[] B) {
        int N = A.length ;
        int M = B.length ; 

        Arrays.sort(A);
        Arrays.sort(B);
        
        List<Integer> ans=new ArrayList<Integer>();

        int P1 =0;
        int P2 =0;
        while(P1<N && P2<M){
            if(A[P1] < B[P2]){
                P1++;
            }
            else if (B[P2] < A[P1]){
                P2++;
            }
            else if(A[P1] == B[P2]){
                ans.add(A[P1]);
                P1++;
                P2++;
            }
            
            
        }



        int ans1[] = new int[ans.size()];
       for(int i=0 ; i<ans.size(); i++){
           ans1[i] = ans.get(i);
       }
       return ans1;

    }
}