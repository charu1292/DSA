package arrays;

public class RemoveDuplicatesTwoPointer {
    ///its also called inplace array --big of N

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int A[] = {1,1,2,2,2,3,3};
        int k = removeDuplicates(A);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
