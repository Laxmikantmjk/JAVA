/*Write a program to input an integer T and then each of T lines will have a string (S).

You have to print T lines each containing length of input string.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0){
            String S = sc.next();
            System.out.println(S.length());
            T--;
        }
       
    }
}