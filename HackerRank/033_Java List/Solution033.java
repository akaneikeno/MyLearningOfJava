// import java.io.*;
import java.util.*;

public class Solution033 {

    public static void main(String[] args) {
        /*
         * Enter your code here.
         * Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        List<String> lArray = new ArrayList<String>(Arrays.asList(sc.nextLine().split(" ")));

        int Q = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<Q; i++){
            String query = sc.nextLine();
            if(query.equals("Insert")){
                String[] indexes = sc.nextLine().split(" ");
                int ix = Integer.parseInt(indexes[0]);
                String iy = indexes[1];
                lArray.add(ix, iy);
                
            }else{
                int dx = Integer.parseInt(sc.nextLine());
                lArray.remove(dx);
            }
        }
        sc.close();
        
        for(int i=0; i<lArray.size(); i++){            
            if(1<lArray.size()){
                System.out.print(lArray.get(i) + " ");
            }else{
                System.out.print(lArray.get(i));
            }
        }
    }
}