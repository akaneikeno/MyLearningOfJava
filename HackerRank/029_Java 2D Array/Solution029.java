// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

public class Solution029 {
    public static void main(String[] args) {

        int[][] array = new int[6][6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            String[] strArray = sc.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                int strArrayJ = Integer.parseInt(strArray[j]);
                array[i][j] = strArrayJ;
            }
        }
        sc.close();

        int hourglasses = -1000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = sumHourglasses(array, i, j);
                if (hourglasses < sum) {
                    hourglasses = sum;
                }
            }
        }
        System.out.println(hourglasses);
    }

    public static int sumHourglasses(int[][] array, int l, int r) {
        return array[l][r] + array[l][r+1] + array[l][r+2] + array[l+1][r+1] + array[l+2][r] + array[l+2][r+1] + array[l+2][r+2];
    }
}