/*
Write a program that returns the product of all elements present in the array.
*/

public static long solve(int[] arr) {

    long ans = 1l;

    int N = arr.length;
    for(int i=0 ; i<N ; i++){
        ans = ans*arr[i];
    }

    return  ans;
    
    
}