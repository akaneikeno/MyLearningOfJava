// import java.io.*;
import java.util.*;
import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class Solution013 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat  nu = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat  ni = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat  nc = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat  nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = nu.format(payment);
        String india = ni.format(payment);
        String china = nc.format(payment);
        String france = nf.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}