import java.util.Scanner;

public class Solution016 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i=0; i<=s.length()-k; i++){
            String temp = s.substring(i, k+i);
            if(i==0){
                smallest = temp;
                largest = temp;
            }else{                
                if(largest.compareTo(temp)<0){
                    largest = temp;
                }

                if(0<smallest.compareTo(temp)){
                    smallest = temp;
                }
            }
        }        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}