package String;

public class PermutationString {
    /**
     * permutation function
     * @param s string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    public static void permuate(String s, int l,int r) {
        if (l==r)
            System.out.println(s);
        else {
            for (int i=l;i<r;i++){
                s= swap(s,l,i);
                permuate(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }

    private static String swap(String s,int i,int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }



    public static void main(String[] args) {
        String s="abcd";
        int l = 0;
        int r = s.length();
        permuate(s,l,r);
    }
}
