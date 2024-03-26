package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SubsetOfArray {
    //Option 1 --Time Complexity: O(M*N)
    static boolean isSubset(int arr1[], int m, int arr2[], int n) {
        if (m > n) return false;
        for (int i = 0; i < m; i++) {
            boolean present = false;
            for (int j = 0; j < n; j++) {
                if (arr2[j] == arr1[i]) {
                    present = true;
                    break;
                }
            }
            if (present == false) return false;
        }
        return true;
    }

    //option 2 -- Time Complexity: O(NlogN+ MlogN)
    static boolean bSearch(int elem, int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return true;
            else if (arr[mid] < elem)
                start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

    static boolean isSubset_1(int arr1[], int m, int arr2[], int n) {
        if (m > n) return false;
        Arrays.sort(arr2);
        for (int i = 0; i < m; i++) {
            boolean present = bSearch(arr1[i], arr2, n);
            if (present == false) return false;
        }
        return true;
    }


    //option 3 hashing ---
     static boolean isSubset_3(int arr1[], int m, int arr2[], int n){

        if(m>n) return false;
        HashMap<Integer, Boolean> mp = new HashMap<Integer, Boolean>();
        for(int i=0; i<n; i++){
    	    mp.put(arr2[i],true);
    	   }
    	for(int j=0;j<m;j++){
    	    if(mp.containsKey(arr1[j])==false){
    	        return false;
    	        }
    	    }
    	    return true;
        }
    public static void main(String[] args) {
        int arr1[]={1,3,4,5,2};
        int arr2[]={2,4,3,1,7,5,15};
        int m = arr1.length;
        int n = arr2.length;
        boolean ans = isSubset(arr1, m, arr2, n);
        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else System.out.print("arr1[] is not a subset of arr2[]");

    }
}
