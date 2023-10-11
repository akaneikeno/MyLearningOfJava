// import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution027 {

    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        sc.close();

        /*
         * Thips: -:   a.subtract(b)
         *        /:   a.divide(b)
         *        %:   a.remainder(b)
         *        a<b: a.compareTo(b)<0
         */
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}