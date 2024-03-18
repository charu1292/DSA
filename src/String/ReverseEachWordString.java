package String;

public class ReverseEachWordString {

    public static String ReverseWord(String S){
        String[] words=S.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<words.length;i++){
            StringBuilder ss=new StringBuilder(words[i]);
            for(int k=0,j=ss.length()-1;k<j;k++,j--)
            {
                char t= ss.charAt(k);
                ss.setCharAt(k,ss.charAt(j));
                ss.setCharAt(j,t);
            }
            sb.append(ss);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="i Have no more patience";
        String ReverseString=ReverseWord(s);
        System.out.println(ReverseString);
    }
}
