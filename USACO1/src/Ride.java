/*
ID: jmassoni1
LANG: JAVA
TASK: ride
 */
import java.io.*;
import java.util.*;

class ride {

    public static void main(String[] args) throws IOException {
        
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                 
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        
        Scanner in = new Scanner(new File("ride.in"));

        String comet = in.next();
        String group = in.next();
        char curr;
        int c = 1;
        int g = 1;
        int[] finalNums = new int[2];

        for (int i = 0; i < comet.length(); i++) {

            curr = comet.charAt(i);

            if (curr == ('A')) {
                c *= 1;
            } else if (curr == ('B')) {
                c *= 2;
            } else if (curr == ('C')) {
                c *= 3;
            } else if (curr == ('D')) {
                c *= 4;
            } else if (curr == ('E')) {
                c *= 5;
            } else if (curr == ('F')) {
                c *= 6;
            } else if (curr == ('G')) {
                c *= 7;
            } else if (curr == ('H')) {
                c *= 8;
            } else if (curr == ('I')) {
                c *= 9;
            } else if (curr == ('J')) {
                c *= 10;
            } else if (curr == ('K')) {
                c *= 11;
            } else if (curr == ('L')) {
                c *= 12;
            } else if (curr == ('M')) {
                c *= 13;
            } else if (curr == ('N')) {
                c *= 14;
            } else if (curr == ('O')) {
                c *= 15;
            } else if (curr == ('P')) {
                c *= 16;
            } else if (curr == ('Q')) {
                c *= 17;
            } else if (curr == ('R')) {
                c *= 18;
            } else if (curr == ('S')) {
                c *= 19;
            } else if (curr == ('T')) {
                c *= 20;
            } else if (curr == ('U')) {
                c *= 21;
            } else if (curr == ('V')) {
                c *= 22;
            } else if (curr == ('W')) {
                c *= 23;
            } else if (curr == ('X')) {
                c *= 24;
            } else if (curr == ('Y')) {
                c *= 25;
            } else if (curr == ('Z')) {
                c *= 26;
            }

        }
        
        for (int i = 0; i < group.length(); i++) {

            curr = group.charAt(i);

            if (curr == ('A')) {
                g *= 1;
            } else if (curr == ('B')) {
                g *= 2;
            } else if (curr == ('C')) {
                g *= 3;
            } else if (curr == ('D')) {
                g *= 4;
            } else if (curr == ('E')) {
                g *= 5;
            } else if (curr == ('F')) {
                g *= 6;
            } else if (curr == ('G')) {
                g *= 7;
            } else if (curr == ('H')) {
                g *= 8;
            } else if (curr == ('I')) {
                g *= 9;
            } else if (curr == ('J')) {
                g *= 10;
            } else if (curr == ('K')) {
                g *= 11;
            } else if (curr == ('L')) {
                g *= 12;
            } else if (curr == ('M')) {
                g *= 13;
            } else if (curr == ('N')) {
                g *= 14;
            } else if (curr == ('O')) {
                g *= 15;
            } else if (curr == ('P')) {
                g *= 16;
            } else if (curr == ('Q')) {
                g *= 17;
            } else if (curr == ('R')) {
                g *= 18;
            } else if (curr == ('S')) {
                g *= 19;
            } else if (curr == ('T')) {
                g *= 20;
            } else if (curr == ('U')) {
                g *= 21;
            } else if (curr == ('V')) {
                g *= 22;
            } else if (curr == ('W')) {
                g *= 23;
            } else if (curr == ('X')) {
                g *= 24;
            } else if (curr == ('Y')) {
                g *= 25;
            } else if (curr == ('Z')) {
                g *= 26;
            }

        }
        
        if (c % 47 == g % 47){
            out.println("GO");
        } else {
            out.println("STAY");
        }
        
        out.close();
    }
}
