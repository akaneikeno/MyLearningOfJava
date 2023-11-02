// import java.io.*;
// import java.util.*;

public class Solution037 {
    public static void main(String[] args) {
        /* Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
        Integer[] iArray = {1, 2, 3};
        String[] sArray = {"Hello", "World"};
        Generics.printArray(iArray);
        Generics.printArray(sArray);
    }
}

class Generics{
    public static<E> void printArray(E[] array){
        for (E e : array) {
            System.out.println(e);
        }
    }
}