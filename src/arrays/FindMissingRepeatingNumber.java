package arrays;

public class FindMissingRepeatingNumber {

    public static void missingRepeatingNumber(int[] A) {
        int n = A.length;
        int repeating = -1;
        int missing = -1;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] == i)
                    cnt++;
            }
            if (cnt == 2)
                repeating = i;
            else if (cnt == 0)
                missing = i;
            if (repeating != -1 && missing != -1) // Corrected condition to stop the loop if both missing and repeating numbers are found
                break;
        }

        System.out.println("Missing number: " + missing);
        System.out.println("Repeating number: " + repeating);
    }
    public static int[] findMissingRepeatingNumbers(int[] a) {
        //  time complexity =2N
        int n = a.length; // size of the array
        int[] hash = new int[n + 1]; // hash array

        //update the hash array:
        for (int i = 0; i < n; i++) {
            hash[a[i]]++;
        }

        //Find the repeating and missing number:
        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) repeating = i;
            else if (hash[i] == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {0, 2, 4, 4, 1, 3};
       missingRepeatingNumber(A);

//        int[] ans=findMissingRepeatingNumbers(A);
//        System.out.println("The repeating and missing numbers are: {"
//                + ans[0] + ", " + ans[1] + "}");
    }
}