/*
Write a program to print the input array A of size N in reverse order where
 
you have to take integer N and further N elements as input from user.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=n-1 ; i>=0 ; i--){
            System.out.print(arr[i] + " ");
        }
        
    }
}

