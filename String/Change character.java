/*
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string. */


public class Solution {
    public int solve(String A, int B) {
        int f[]=new int[26];
        int idx=0; 
        int count=0;

        if(A.length()==1){
             return 1;
        }
       
        for(int i=0;i<A.length();i++){
            idx=A.charAt(i)-'a';
            f[idx]++;
        }

        Arrays.sort(f);
        for(int i=0;i<f.length;i++){
            if(f[i]>0){
                B= B-f[i];
                if(B<0){
                 count++;
                }
            }
        }
        return count;
    }

}