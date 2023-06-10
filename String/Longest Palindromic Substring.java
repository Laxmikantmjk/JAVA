/*
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).

*/

public class Solution {
    public static String expand(String s,int start ,int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        if(start<=end){
            return s.substring(start+1,end);
        }
        else{
            return "";
        }
    }
    public String longestPalindrome(String A) {
        int n=A.length();
        int ans=0;
        String s="";
        for(int i=0; i<n; i++){
            String temp=expand(A,i,i); // For Odd
            if(temp.length()>s.length()){
                s=temp;
            }
        }
        for(int i=0; i<n; i++){
            String temp=expand(A,i,i+1); // For Even
            if(temp.length()>s.length()){
                s=temp;
            }
        }
        return s;
    }
}