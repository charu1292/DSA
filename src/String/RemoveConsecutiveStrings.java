package String;

public class RemoveConsecutiveStrings {
    public static String deleteConsecutiveStrings(String s)
    {

        // Initialize start and stop pointers
        int i = 0;
        int j = 0;

        // Initialize an empty string for new elements
        String newElements = "";

        // Iterate string using j pointer
        while (j < s.length()) {

            // If both elements are same then skip
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            // If both elements are not same then append new
            // element
            else if (s.charAt(j) != s.charAt(i)
                    || j == s.length() - 1) {
                newElements += s.charAt(i);

                // After appending, slide over the window
                i = j;
                j++;
            }
        }

        // Append the last string
        newElements += s.charAt(j - 1);
        return newElements;
    }

    public static void main(String[] args) {
        String s = "geeks for geeks is best";
        // Printing result
        System.out.println("Output : "
                + deleteConsecutiveStrings(s));

    }
}
