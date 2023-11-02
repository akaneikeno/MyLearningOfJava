/*
 * Write a function that takes number n and print all the numbers from 1 to n.
 * If the number is divisable by 3, print "Fizz" instead of the number.
 * If the number is divisable by 5, print "Bizz" instead of the number.
 * If the number is divisable by both, print "FizzBizz" instead of the number.
 */
import java.util.Scanner;

/*
 * scale, asynchonos\
 * spring tool, restAPI
 * fizzbuzz api
 * imput page(synchronous)  : press button -> show answers
 * -> + get result button in another page (asynchronous) 
 */

class AnotherFizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=0; i<=n; i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }    
}