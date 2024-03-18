package arrays;

public class InsertionSort {

    ///time complexity  is n2

    public static void insertion_sort(int[] A){
        int n=A.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && A[j-1]>A[j]) {
                A[j-1]=A[j-1]+A[j];
                A[j]=A[j-1]-A[j];
                A[j-1]=A[j-1]-A[j];
                j--;
            }

        }

    }
    public static void main(String[] args) {
        int[] A ={22,11,20,89,5};
        insertion_sort(A);
        for (int i=0;i<A.length;i++){
            System.out.print(A[i]+ " ");
        }
    }
}
