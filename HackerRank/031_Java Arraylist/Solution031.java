// import java.io.*;
import java.util.*;
// import javax.swing.tree.ExpandVetoException;

public class Solution031 {

    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */

         //The first line has an integer n.
         // In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<ArrayList<Integer>> array = new ArrayList<>();  
        for (int i = 0; i < n; i++) {                   
            String[] tempArray = sc.nextLine().split(" ");
            ArrayList<Integer> queryArray = new ArrayList<>();
            queryArray.clear();

            for(int j=1; j<tempArray.length; j++){
                queryArray.add(Integer.parseInt(tempArray[j]));
            }
            array.add(i, queryArray);
        }        

        //In the next line there will be an integer q denoting number of queries.
        //Each query will consist of two integers x and y.
        int q = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i<q; i++) {            
            String[] xyArray = sc.nextLine().split(" ");
            int x = Integer.parseInt(xyArray[0]);
            int y = Integer.parseInt(xyArray[1]);

            try{
                System.out.println(array.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}