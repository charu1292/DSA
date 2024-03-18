package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesUsingHashMap {

    public static int[] removeDuplicates(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        ArrayList<Integer> arrNew = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (A[i] != A[i + 1]) {
                arrNew.add(A[i]);
            }
        }
        arrNew.add(A[n - 1]); // Add the last element (not checked in loop)

        // Convert ArrayList back to array
        int[] result = new int[arrNew.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrNew.get(i);
        }

        return result;
    }

    public static void displayArray(int[] M) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println(); // Print newline
    }

    public static void main(String[] args) {
        int A[] = {22, 55, 33, 22, 44, 66, 77, 55};
        int[] result = removeDuplicates(A);
        displayArray(result);
    }
}