/*
ID: jmasson1
PROG: dualpal
LANG: JAVA
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class dualpal {

	private static boolean isPalindrome(String s) {
		int length = s.length();
		if (length < 2) {
			return true;
		}
		else {
			return s.charAt(0) != s.charAt(length - 1) ? false
					: isPalindrome(s.substring(1, length - 1));
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));

		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

//		System.out.println(Integer.toBinaryString(N));
//		String number = Integer.toBinaryString(s);
//		int numbers = Integer.parseInt(number, 2);
//		
//		System.out.println(isPalindrome(numbers));
//		System.out.println(numbers);
		//int[]bases = {2,3,4,5,6,7,8,9,10};		
//		int[] lines = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			lines[i] = s + 1;
//			s++;
//		}

		//String[] temp =  new String [n];
		//int[] tempNumbers = new int[bases.length];
		int total = 0;
		for (int i = s + 1; total < n; i++) {

			int palinCount = 0;
			for (int base = 2; base <= 10; base++) {
				if (isPalindrome(Integer.toString(i, base))) {
					palinCount++;
					if (palinCount >= 2) {
						break;
					}
				}
			}
			if (palinCount >= 2) {
				total++;
				out.println(i);
			}

		}

		out.close();

	}// end of main
}// end of class
