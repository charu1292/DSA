package arrays;

public class BubbleSort {

    ///time complexity  is n2

    public static void bubble_sort(int[] A){
        int n =A.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    A[i]=A[i]+A[j];
                    A[j]=A[i]-A[j];
                    A[i]=A[i]-A[j];
                }
            }
        }
    }


    public static void main(String[] args) {

        int A[]={22,44,525,2,1,8};
        bubble_sort(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
