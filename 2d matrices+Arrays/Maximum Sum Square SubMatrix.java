/*

Given a 2D integer matrix A of size N x N, find a B x B submatrix where B<= N and B>= 1, 
such that the sum of all the elements in the submatrix is maximum.
*/

public class Solution {
    public int solve(int[][] A, int B) {
        int n=A.length;
        int[][] p=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                p[i][j]=A[i][j];
                if(i!=0){
                    p[i][j]+=p[i-1][j];
                }
                if(j!=0){
                    p[i][j]+=p[i][j-1];
                }
                if(i!=0&&j!=0){
                    p[i][j]-=p[i-1][j-1];
                }
            }
        }
        int sum=0, ans=Integer.MIN_VALUE;
        for(int i=B-1;i<n;i++){
            for(int j=B-1;j<n;j++){
                int ex=i;
                int ey=j;
                int sx=i-(B-1);
                int sy=j-(B-1);
                sum=p[ex][ey];
                if(sx>0){
                    sum-=p[sx-1][ey];
                }
                if(sy>0){
                    sum-=p[ex][sy-1];
                }
                if(sx>0&&sy>0){
                    sum+=p[sx-1][sy-1];
                }
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}