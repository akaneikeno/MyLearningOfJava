//import java.io.*;
//import java.util.*;

import java.util.Scanner;

public class Solution010 {

    public static void main(String[] args) {
        /* Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        sc.close();

        if(0<B && 0<H){
            System.out.println(B * H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
       }
}
