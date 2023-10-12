// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
import java.util.regex.*;

public class Solution024 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (0 < testCases) {
			String line = in.nextLine();

			// Write your code here
			Matcher tagMatcher = RegEx.tagPattern.matcher(line);
			if (tagMatcher.find()) {
				do {
					System.out.println(tagMatcher.group(2));
				} while (tagMatcher.find());
			} else {
				System.out.println("None");
			}
			testCases--;
		}
		in.close();
	}
}

class RegEx {
	private static String tagRegEx = "<(.+)>([^<]+)</\\1>";
	public static Pattern tagPattern = Pattern.compile(tagRegEx);
}