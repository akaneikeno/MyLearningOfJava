import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution018 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = true;
        if (a.length() != b.length()) {
            result = false;
        } else {
            String[] aArray = new String[a.length()];
            String[] bArray = new String[b.length()];
            putChar(a, aArray);
            putChar(b, bArray);

            for (int i = 0; i < a.length(); i++) {
                if (aArray[i].equals(bArray[i]) == false) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    static void putChar(String str, String[] array) {
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.substring(i, i + 1).toLowerCase();
        }
        sortArray(array);
    }

    static void sortArray(String[] array) {
        String temp;
        for (int i = 0; i <array.length; i++) {
            for (int j = array.length-1; i < j; j--) {
                if (array[j].compareTo(array[i]) < 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
