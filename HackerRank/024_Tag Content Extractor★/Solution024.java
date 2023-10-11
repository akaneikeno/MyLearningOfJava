import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution024{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(0<testCases){
			String line = in.nextLine();
			
          	//Write your code here
			if(countChar(line, "<")!=countChar(line, ">") || countChar(line, "<")/2!=countChar(line, "<//")){
				System.out.println("none");
				break;
			}else{

			}			
			testCases--;
		}
        in.close();
	}

	public static int countChar(String str, String ch){		
		String[] array = str.split("");
		int count = 0;
		for (String s: array) {
			if(s.equals(ch)){
				count++;
			}
        }
		return count;
	}
}