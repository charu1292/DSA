package String;

public class ReverseWordsInString {

    public static String reverseWord(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i= words.length-1;i>0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }


    public static void main(String[] args) {
        String s="I like this Program very    much ";
        //output: much very program this like I

        String Reversed=reverseWord(s);
        System.out.println(Reversed);
    }
}
