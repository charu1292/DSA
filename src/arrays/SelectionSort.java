package arrays;

public class SelectionSort {

    public static void getsort(int A[]){
        int n =A.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]>A[j]) {
                    A[i] = A[i] + A[j];
                    A[j] = A[i] - A[j];
                    A[i] = A[i] - A[j];
                }

            }
        }
    }

    public static void display(int[]A ){
        int n =A.length;
        for(int i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }
    }


    public static void main(String[] args) {
       int[] A ={2,7,1,10,3,8,12};
        getsort(A);
        display(A);
    }
}
