/*

Take two string from user, which are space separated. first is string A, and second is string B.

Concatenate String A and String B and places " loves " in between String A and String B.

*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.print(A + " loves " + B) ;
        
    }
}