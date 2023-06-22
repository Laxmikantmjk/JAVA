/*
Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.
*/
import java.lang.*;
import java.util.*;
import java.util.Collections;
public class Solution {
    public void arrange(ArrayList<Integer> A) {
        int N = A.size();

        for(int i=0 ; i<N ; i++){
            //int k = A.get(i);
            int factor = A.get(A.get(i));
            if(A.get(i)<i){
                factor = factor/N;
            }

            int value = A.get(i)*N + factor;
            A.set(i , value);
        }

        for(int i=0 ; i<N ; i++){
            A.set(i , A.get(i)%N);
        }

        
        return;
    }
}