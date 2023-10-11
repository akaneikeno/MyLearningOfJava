import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution022 {

    public static void main(String[] args) {
        /*
         * \\b: word boundary
         * \\w: A word character: [a-zA-Z_0-9]
         * \\W: A non-word character, except [a-zA-Z_0-9]. In this case, this matches
         * space.
         * +: matches the previous token between one and unlimited times as many time as
         * possible, giving back as needed
         * (?:●): ●, as a non-capturing group. Explicitly states that grouping is the
         * only purpose
         * \\1: Match strings memorised in the forward, in this case (\\w+)
         */

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
         * Pattern.compile(String regex, int flags)
         * Parameters:
         * regex: The expression to be compiled
         * flags: Match flags, a bit mask that may include below:
         * CANON_EQ: Enable regular equivalents
         * CASE_INSENSITIVE: don't distinguish between upper cases and lower cases
         * COMMENTS: Allow white space and comments in patterns
         * DOTALL: Enable dotall mode
         * LITERAL: Enable literal parsing of patterns
         * MULTILINE: Enable multi-line mode
         * UNICODE_CASE: don't distinguish between upper cases and lower cases in
         * accordance with Unicode
         * UNICODE_CHARACTER_CLASS: Enable Unicode versions of predefined character
         * classes and POSIX character classes
         * UNIX_LINES: Enable Unix line mode
         * Returns:
         * the given regular expression compiled into a pattern with the given flags
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
                 * String.replaceAll(String regex, String replacement)
                 * Parameters:
                 * regex: The regular expression to which this string is to be matched
                 * replacement: The string to be substituted for each match
                 * Returns:
                 * The resulting String
                 */

                /*
                 * String regex.Matcher.group(int group())
                 * Parameters:
                 * group: The index of a capturing group in this matcher's patter
                 * Returns:
                 * The (possibly empty) subsequence captured by the group during the previous
                 * match, or null if the group failed to match part of the input
                 */
                // If input matches p, proceed this code.
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}