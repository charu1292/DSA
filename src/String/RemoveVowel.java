package String;

public class RemoveVowel {

    static void removal(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                    || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }

    }
    static String remVowel(String str)
    {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "GeeeksforGeeks - A Computer Science Portal for Geeks";
        System.out.println(remVowel(str));


        removal(str);
    }
}
