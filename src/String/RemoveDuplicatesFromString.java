package String;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromString {

    public static String removeCharacters(String s){
        char[] A=s.toCharArray();
        StringBuilder st = new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<A.length;i++){
            if(!map.containsKey(A[i])) {
                st.append(A[i]);
                map.put(A[i], 1);
            }

        }
        return st.toString();
        }

    public static void main(String[] args) {
        String s = "HappyNewYear";
        String result=removeCharacters(s);

        System.out.println(result);
    }
}
