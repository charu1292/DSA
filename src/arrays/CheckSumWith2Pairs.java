package arrays;

import java.util.Arrays;

public class CheckSumWith2Pairs {
    //1.if array is sorted we can two pointer approach i from 0 and j frrom n-1 and check sum at each stage,
    // if sun is less than desired sun the increemnet i other wise decrement j
    //2.we need to apply two loops: We can take 1 element in first loop and iterate through every element of an array in inner loop and check sum in each case.

    public static void checkSumInSortedArray(int[] A, int n,int k){
        Arrays.sort(A);
        if (A==null||n==1){
            System.out.println("Array have no or 1 element only");
            return;
        }
        for (int i=0,j=n-1;i<j;) {
            if ((A[i] + A[j]) == k) {
                System.out.println("pair found " + A[i] + " : " + A[j]);
                i++;
                j--;
            } else if ((A[i] + A[j]) > k) {
                j--;
            } else if ((A[i] + A[j]) < k) {
                i++;
            } else System.out.println("No pair found");
        }
    }


    public static void getPairsIfSum(int[] A,int n ,int k) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if ((A[i] + A[j]) == k) {
                    System.out.println("pair found " + A[i] + " : " + A[j]);

                }
        }
    }
    public static void main(String[] args) {
        int[] A ={1,2,8,9,4,28,11,0,10};
        int n = A.length;
        int k=10;
            getPairsIfSum(A,n,k);

    }
}
