// import java.io.*;
import java.util.*;

public class Solution009 {

    public static void main(String[] args) {
        /* Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */

         /*
          * Tips: It is a Scanner class method which returns true if this scanner has another token in its input.
          *       This method may block while waiting for input to scan.
          */
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(num + " " + str);
            num++;
        }
        sc.close();
    }
}