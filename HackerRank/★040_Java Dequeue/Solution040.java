import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        in.close();

        int max = 0;
        for (int i = 0; i < n-m; i++) {
            int temp = checkDeque(deque, i, m);
            if(max<temp){
                max = temp;
                if(max==m){
                    System.out.println(max);
                    System.exit(0);
                }
            }
            deque.pop();
        }
        System.out.println(max);
    }

    public static int checkDeque(Deque<Integer> dec, int num, int m){
        Set<Integer> set = new HashSet<Integer>();
        Deque<Integer> d = dec;
        for(int i=0; i<m; i++){
            set.add(d.pop());
        }
        return set.size();
    }
}