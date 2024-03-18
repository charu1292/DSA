package arrays;

public class SeparateNagativePositives {

    //1.sort the array and it will palace negatives first and the postives
    //2.secondly,we are taking 2 pointer approach one starting from 0th index and second start from last index of and array
    //we increement (i) till we found  postive num and stop and decrement till we found negative element and then swipe the value

    public static void negative_elements(int[] A){
        int n=A.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(A[i]<=0 && A[j]<0)
                i++;
            else if(A[i]>0 && A[j]<0){
                A[i]=A[i]+A[j];
                A[j]=A[i]-A[j];
                A[i]=A[i]-A[j];
                i++;
                j--;
            } else if (A[i]>0 && A[j]>0) {
                j--;

            }
            else {
                i++;
                j--;
            }
        }
    }

    public static void display_arr(int[] A,int n) {
        for (int x = 0; x < n; x++) {
            System.out.print(A[x] + " ");
        }
    }

    public static void main(String[] args) {
        int[] A={2,4,-1,-3,8,6,-5,6,11,-6};
        int n=A.length;
        negative_elements(A);
        display_arr(A,n);

        }


    }

