/*iven a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits. 
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324 and 245. 
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different */

public class Solution {
    public int colorful(int A) {


        ArrayList<Integer>list = new ArrayList<>();

        while(A>0){
            int X = A%10;
            list.add(X);
            A = A/10;
        }

        Collections.reverse(list);

        int N = list.size();

        HashSet<Integer>set = new HashSet<Integer>();

        for(int i=0 ; i<N ; i++){
            int prod=1;
            for(int j=i ; j<N ; j++){
                prod = prod * list.get(j);
                if(set.contains(prod)){
                    return 0;
                }
                else{
                    set.add(prod);
                }
            }
        }

        return 1;

    }
}
