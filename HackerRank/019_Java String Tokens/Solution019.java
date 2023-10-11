//import java.io.*;
//import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        String[] tempArray = s.split("[\\s!,?._'@]");
        ArrayList<String> sArray = new ArrayList<>();
        for (String ta : tempArray) {
            if(ta.isEmpty()==false){
                sArray.add(ta);
            }
        }

        System.out.println(sArray.size());
        for (String sa : sArray) {
            System.out.println(sa);
        }
    }
}
