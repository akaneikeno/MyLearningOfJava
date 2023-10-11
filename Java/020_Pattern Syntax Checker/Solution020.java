import java.util.Scanner;
import java.util.regex.*;

public class Solution020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i=0; i<testCases; i++) {
            String pattern = in.nextLine();
            // Write your code

            try {
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}