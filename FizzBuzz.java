/*
 * Write a short program that prints each number from 1 to 100 on a new line. 
 * For each multiple of 3, print "Fizz" instead of the number. 
 * For each multiple of 5, print "Buzz" instead of the number. 
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
