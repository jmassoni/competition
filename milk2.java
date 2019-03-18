
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
ID: jmasson1
PROG: milk2
LANG: JAVA
 */
public class milk2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
//
        Scanner in = new Scanner(new File("milk2.in"));
//        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int contTime = 0;
        int idleTime = 0;
        int x = 0;
        int y = 0;
//
        int start = 1000000;
        int end = 0;
        int[] between = new int[1000001];
//
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            start = Math.min(start, x);
            end = Math.max(end, y);
            for (int j = x; j < y; j++) {
                between[j]++;
//                System.out.println(between[j]);
            } // end inner for loop
        } // end outer for loop
        
        int a = 0;
        int b = 0;
        for (int i = start; i < end; i++) {
            if (between[i] > 0) {
                a++;
                b = 0;
            } else {
                b++;
                a = 0;
            }
            contTime = Math.max(contTime, a);
            idleTime = Math.max(idleTime, b);
        }
        out.println(contTime + " " + idleTime);
      out.close();
    }

}
