/*Take two Strings str1 and str2 from user(which is provided in single line and space separated), 
 * concatenate both string and print the final result. */

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();

        System.out.print(S1+S2);
    }
}