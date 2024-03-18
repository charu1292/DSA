package String;

public class ReverseOnlyStringNotDigit {
    public static String reverseCharactersOnly(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            // Skip digits from the start
            while (i < j && !Character.isLetter(chars[i])) {
                i++;
            }
            // Skip digits from the end
            while (i < j && !Character.isLetter(chars[j])) {
                j--;
            }
            // Swap characters if both are letters
            if (Character.isLetter(chars[i]) && Character.isLetter(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            i++;
            j--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "abcd66ty78jkum98yolo";
        String reversed = reverseCharactersOnly(s);
        System.out.println(reversed); // Output: "dcbd66yt78mukj98oloy"
    }
}
