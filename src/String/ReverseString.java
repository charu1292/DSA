package String;

public class ReverseString {

    public static String reverse(String S){

        char[] A=S.toCharArray();
        int n=A.length;
        for (int i=0,j=n-1;i<j;i++,j--){
            A[i] = (char) (A[i] + A[j]);
            A[j] = (char) (A[i] - A[j]);
            A[i] = (char) (A[i] - A[j]);
        }
        return new String(A);
        }
    public static String Reverse2(String s){
        StringBuilder ss= new StringBuilder(s);
        for(int i=0,j=ss.length()-1;i<j;i++,j--){
            char t=s.charAt(i);
            ss.setCharAt(i,ss.charAt(j));
            ss.setCharAt(j,t);
        }

        return ss.toString();
    }

    ///recursive method to reverse a string
    public static char[] reverse_recursive(int i, String s) {
        char[] A = s.toCharArray();
        int n = A.length;
        if (i >= n / 2)
            return A;
        swap(A, i, n - i - 1);
        reverse_recursive(i + 1, s);
        return A;
    }
    private static void swap(char[] A, int i, int j) {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        String S="Geeks of geeks";
        String Reversed =Reverse2(S);
        System.out.println(Reversed);

    }
}
