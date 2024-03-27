package arrays;

public class MergeTwoSortedArray {

    static int[] mergeArray(int[] A, int[] B){
        int m=A.length;
        int n=B.length;
        int[] c = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(A[i]<B[j]){
                c[k++]=A[i++];
            }
            else
                c[k++]=B[j++];
        }
        while (i<m){
            c[k++]=A[i++];
        }
        while(j<n)
        {
            c[k++]=B[j++];
        }

        return c;

    }

    public static void main(String[] args) {
        int[] A={22,33,44};
        int[] B={5,6,7,8,9};
        int[] D =mergeArray(A,B);
        for (int i =0;i<D.length;i++){
            System.out.print(D[i] + " ");
        }

    }
}
