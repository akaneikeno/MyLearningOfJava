import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution022 {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
         * Parameters: 
         *      String regex: The expression to be compiled
         *      int flags:    Match flags, a bit mask that may include below:
         *                        CANON_EQ: Enable regular equivalents
         *                        CASE_INSENSITIVE: don't distinguish between upper cases and lower cases
         *                        COMMENTS: Allow white space and comments in patterns
         *                        DOTALL: Enable dotall mode
         *                        LITERAL: Enable literal parsing of patterns
         *                        MULTILINE: Enable multi-line mode
         *                        UNICODE_CASE: don't distinguish between upper cases and lower cases in accordance with Unicode
         *                        UNICODE_CHARACTER_CLASS: Enable Unicode versions of predefined character classes and POSIX character classes
         *                        UNIX_LINES: Enable Unix line mode
         * Returns:
         *      the given regular expression compiled into a pattern with the given flags
         */
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                /*
                * Parameters: 
                *      String regex:       The regular expression to which this string is to be matched
                *      String replacement: The string to be substituted for each match
                * Returns:
                *      The resulting String
                */
                //If input matches p, proceed this code.
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}