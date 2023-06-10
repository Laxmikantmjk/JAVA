/*We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).
*/

public class Solution {
    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int dist[] = new int [N];

        for(int i =0 ; i<N ; i++){
            int X = A[i][0];
            int Y = A[i][1];
            int Z = (X*X) + (Y*Y);
            dist[i] = Z ;
        }

        Arrays.sort(dist);

        int range = dist[B-1];
        int ans[][] = new int[B][2];
        int count=0;

        for(int i=0 ; i<N ; i++){
            int X = A[i][0];
            int Y = A[i][1];
            int Z = (X*X) + (Y*Y);
            if(Z<=range){
                ans[count][0] = A[i][0];
                ans[count][1] = A[i][1];
                count++;
            }
        }


        

        return ans;
    }
}

