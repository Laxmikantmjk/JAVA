/*Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 */
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {

        int N = A.length;
        int M = B.length;

        List <Integer> SL = new ArrayList<Integer>();

        int i=0;
        int j=0;

        while(i<N && j<M){
            if(A[i] < B[j]){
                SL.add(A[i]);
                i++;
            }
            else{
                SL.add(B[j]);
                j++;
            }
        }

        while(i<N){
            SL.add(A[i]);
            i++;
        }
        while(j<M){
            SL.add(B[j]);
            j++;
        }

        int X = SL.size();

        int ans[] = new int[X];

        for(int k=0 ; k<X ; k++){
            ans[k] = SL.get(k);
        }

        return ans;
    }
}