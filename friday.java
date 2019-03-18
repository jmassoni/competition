/*
ID: jmassoni1
LANG: JAVA
TASK: friday
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class friday {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        Scanner in = new Scanner(new File("friday.in"));

//        Scanner in = new Scanner(System.in);
        int years = in.nextInt();
        int end = 1900 + years;
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapDay = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] fridayTheThirteenth = new int[7];
        Arrays.fill(fridayTheThirteenth, 0);
        int dayOfWeek = 0;

        for (int start = 1900; start < end; start++) {
            for (int month = 0; month < 12; month++) {
                int today = (dayOfWeek + 12) % 7;
                fridayTheThirteenth[today]++;

                if (leapYear(start) == true) {
                    dayOfWeek += leapDay[month];
                } else {
                    // System.out.outln("what");
                    dayOfWeek += months[month];
                }
            } // end inner for loop
        } // end outer for loop

//        swap(fridayTheThirteenth, 0, 5);
//        swap(fridayTheThirteenth, 2, 4);
//        swap(fridayTheThirteenth, 3, 6);
//        swap(fridayTheThirteenth, 5, 6);
//
//        StringBuilder builder = new StringBuilder();
//        for (int value : fridayTheThirteenth) {
//            builder.append(value);
//            builder.append(" ");
//        }
//        String text = builder.toString();
//        System.out.out(text);
        out.print(fridayTheThirteenth[5] + " ");
        
        out.print(fridayTheThirteenth[6] + " ");

        out.print(fridayTheThirteenth[0] + " ");

        out.print(fridayTheThirteenth[1] + " ");

        out.print(fridayTheThirteenth[2] + " ");

        out.print(fridayTheThirteenth[3] + " ");

        out.println(fridayTheThirteenth[4]);

        out.close();

    } // end main
//
//    public static void swap(int[] a, int i, int j) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }

    public static boolean leapYear(int x) {
        boolean leapYear;
        if (x % 4 == 0 && (x % 100 != 0) || x % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        return leapYear;
    } // end of leapYear boolean
} // end friday
