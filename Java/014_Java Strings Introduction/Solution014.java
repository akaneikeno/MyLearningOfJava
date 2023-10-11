// import java.io.*;
import java.util.*;

public class Solution014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        /*
         * Enter your code here.
         * Print output to STDOUT.
         */
        sc.close();

        sumLength(A, B);
        isAgrater(A, B);
        connectAB(A, B);
    }

    public static void sumLength(String a, String b) {
        System.out.println(a.length() + b.length());
    }

    public static void isAgrater(String a, String b) {
        if (0<a.compareTo(b)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void connectAB(String a, String b) {
        String capA = a.substring(0, 1).toUpperCase() + a.substring(1);
        String capB = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(capA + " " + capB);
    }
}
