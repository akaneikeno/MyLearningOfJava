import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        //Tips: January is 0, December is 11.
        cal.set(year, month-1, day);
        
        int weekdayNum = cal.get(Calendar.DAY_OF_WEEK);
        String weekdayStr = "";

        switch(weekdayNum){
            case Calendar.SATURDAY:
                weekdayStr = "SATURDAY";
                break;
            case Calendar.SUNDAY:
                weekdayStr = "SUNDAY";
                break;
            case Calendar.MONDAY:
                weekdayStr = "MONDAY";
                break;
            case Calendar.TUESDAY:
                weekdayStr = "TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                weekdayStr = "WEDNESDAY";
                break;
            case Calendar.THURSDAY:
                weekdayStr = "THURSDAY";
                break;
            case Calendar.FRIDAY:
                weekdayStr = "FRIDAY";
                break;
        }        
        return weekdayStr;
    }
}

public class Solution012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
