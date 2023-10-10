//import java.io.*;
//import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /* Enter your code here.
           Print output to STDOUT.
           Your class should be named Solution.
        */
        for(int i = 1; i<=100; i++){
            System.out.println(fizzBuzz(i));
        }
    }
    
    public static String fizzBuzz(int num){
        String res = "";
        if(num % 3==0){
            res = "Fizz";
        }
        if(num % 5==0){
            res += "Buzz";
        }
        if(res==""){
            res = Integer.toString(num);
        }        
        return res;
    }
}
