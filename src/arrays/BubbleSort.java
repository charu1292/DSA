package arrays;

public class BubbleSort {

    ///time complexity  is n2
    public static void bubble_sort(int[] arr) {

        boolean swapped = true;
        for(int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
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
