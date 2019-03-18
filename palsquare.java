/*
ID: jmasson1
PROG: palsquare
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class palsquare {

    public static void main(String[] args) throws FileNotFoundException, IOException {
     BufferedReader f = new BufferedReader(new FileReader("palsquare.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
//
        Scanner in = new Scanner(new File("palsquare.in"));
//        Scanner in = new Scanner(System.in);
        
        int base = in.nextInt();
        
        for(int i=1; i <= 300; i ++) {
            String a = Integer.toString(i * i, base);
            if(isPalindrome(a)) {
                out.println(Integer.toString(i, base).toUpperCase() + " " + Integer.toString(i * i, base).toUpperCase());
            }
        }
        out.close();
    } // end main

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
} // end palsquare class