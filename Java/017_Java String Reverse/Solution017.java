// import java.io.*;
import java.util.*;

public class Solution017 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /*
         * Enter your code here.
         * Print output to STDOUT.
         */
        sc.close();
        checkIsPalindrome(A);
        }

    public static void checkIsPalindrome(String str) {
        boolean check = true;
        for(int i=0; i<str.length()/2; i++){
            String head = str.substring(i, i+1);
            String last = str.substring(str.length()-1-i, str.length()-i);
            if(head.equals(last)){
                continue;
            }else{
                check = false;
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}