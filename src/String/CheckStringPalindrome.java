package String;


//1.check the reverse of string is equal to orignial string
//2.check with two pointer approach check A[i]==A[j]
public class CheckStringPalindrome {


    public static boolean checkPalindrome(String S) {
        int n = S.length();
        if (n == 0)
            return false;
        if (S.charAt(0) != S.charAt(n - 1))
            return false;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (S.charAt(i) != S.charAt(j))
                return false;

        }
        return true;

    }

    public static String Reverse(String S) {
        char[] A = S.toCharArray();
        int n = A.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            A[i] = (char) (A[i] + A[j]);
            A[j] = (char) (A[i] - A[j]);
            A[i] = (char) (A[i] - A[j]);
        }
        return new String(A);
    }


    public static void main(String[] args) {
        String S = "Aman";
//        String reversed =Reverse(S);
//        System.out.println(reversed);

        boolean result = checkPalindrome(S);
        if (result) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}