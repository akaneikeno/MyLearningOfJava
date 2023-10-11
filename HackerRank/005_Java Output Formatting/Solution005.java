import java.util.Scanner;

public class Solution005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line

            /*
             * Tips: %: start of format specifier
             *       -: pad ending characters with spaces
             *       s: String
             *       0: pad leading digits with zeroes
             *       d: decimal
             *       n: new line
             */
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
        sc.close();
    }
}