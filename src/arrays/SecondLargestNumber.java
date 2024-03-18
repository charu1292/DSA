package arrays;

public class SecondLargestNumber {
    public static int  second_largest_number(int[] A){
        int l=largest(A);
        int Second_l=-1;
        for (int i=0;i<A.length;i++){
            if(A[i]>Second_l && A[i]!=l)
            {
                Second_l=A[i];
            }
        }
        return Second_l;

    }

    private static int largest(int[] A){
        int largest=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>largest)
                largest=A[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] A = {3, 45, 12, 46, 98, 65, 88, 21};
        int n = A.length;
        int c = second_largest_number(A);
        System.out.print(c);
    }
}
