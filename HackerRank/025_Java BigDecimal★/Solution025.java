import java.math.BigDecimal;
import java.util.*;

class Solution025 {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        // Write your code here
        for (int i = 0; i < s.length; i++) {
            String temp = "";
            for (int j = s.length - 1; i < j; j--) {
                BigDecimal charI = new BigDecimal(s[i]);
                BigDecimal charJ = new BigDecimal(s[j]);

                if(charI.compareTo(charJ)<0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}