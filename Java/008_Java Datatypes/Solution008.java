import java.util.*;
// import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        /*
         * Tips: byte:  from    -128 to     127
         *       short: from -32,768 to  32,767
         *       int:   from   -2^31 to 2^31 -1 (from -2,147,483,648 to 2,147,483,647)
         *       long:  from   -2^63 to 2^63 -1 (from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
         */

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (-128 <= x && x <= 127) {
                    System.out.println("* byte");
                    // Complete the code
                }

                if (Short.MIN_VALUE <= x && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if(Long.MIN_VALUE<=x && x<=Long.MAX_VALUE){
                System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}