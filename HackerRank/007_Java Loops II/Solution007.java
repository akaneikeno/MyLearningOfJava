import java.util.*;
// import java.io.*;

class Solution007 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            multiNums(a, b, n);
        }
        in.close();
    }

    public static void multiNums(int a, int b, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = a + b;
                printResult(result, n, i);
            } else {
                result += calcPowerMultiplier(b, i);
                printResult(result, n, i);
            }
        }
    }

    public static int calcPowerMultiplier(int b, int num) {
        int result = 1;
        for (int i = 0; i < num; i++) {
            result *= 2;
        }
        return b * result;
    }

    public static void printResult(int result, int n, int i) {
        if(n-i != 1){
            System.out.print(result + " ");
        }else{
            System.out.println(result);
        }
    }
}
