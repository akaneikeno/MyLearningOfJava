// import java.io.*;
import java.util.*;

public class Solution030 {

    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                if(sumArrayItems(array, i, j)<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int sumArrayItems(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }
}