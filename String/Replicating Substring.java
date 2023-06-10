/*Given a string B, find if it is possible to re-order the characters of the string 
 * B so that it can be represented as a concatenation of A similar strings.
Eg: B = aabb and A = 2, then it is possible to re-arrange the string as 
"abab" which is a concatenation of 2 similar strings "ab".
If it is possible, return 1, else return -1.*/

public class Solution {
    public int solve(int A, String B) {

        int N = B.length();

        HashMap <Character, Integer>map = new HashMap<Character , Integer>();

        for(int i=0 ; i<N ; i++){
            char C = B.charAt(i);
            if(map.containsKey(C)){
                int X = map.get(C);
                X++;
                map.put(C , X);
            }
            else{
                map.put(C,1);
            }
        }

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        Character key = entry.getKey();
        Integer value = entry.getValue();
        if(value %A !=0){
        return -1;
        }
    }

    return 1;
    }
}
