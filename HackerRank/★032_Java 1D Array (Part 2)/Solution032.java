import java.util.*;

public class Solution032 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean result = true;
        for (int i = 0; i < game.length; i++) {
            if (game[i] == 0) {
                if (canMove(i, leap, game) == false) {
                    return false;
                }
            }
        }
        return result;
    }

    public static boolean canMove(int whereamI, int leap, int[] game) {
        int goal = game.length - 1;
        int walk = whereamI + 1;
        int back = whereamI - 1;
        int leapPoint = whereamI + leap;
        if(whereamI==0){
            if (game[walk] == 0 || game[leapPoint] == 0) {
                return true;
            }else{
                return false;
            }
        }else if (whereamI == goal || goal < leapPoint) {
            return true;
        } else if ((game[walk] == 1 || game[back] == 1) && game[leapPoint] == 1 ) {
            return false;
        } else if (game[walk] == 0 || game[back] == 0 || game[leapPoint] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}