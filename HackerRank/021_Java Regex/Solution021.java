// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
import java.util.Scanner;

class Solution021{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

//Write your code here
/*
 * \\d{1,2}:        1- 99
 * (0|1)\\d{1,2}: 000-199
 * 2[0-4]\\d{1}:  200-249
 * 25[0-5]:       250-255
 */
class MyRegex{
    String ipRegex = "(\\d{1,2}||(0|1)\\d{1,2}||2[0-4]\\d{1}||25[0-5])";
    public String pattern = ipRegex + "\\." + ipRegex + "\\." + ipRegex + "\\." + ipRegex;
}