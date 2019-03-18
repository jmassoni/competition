//Contest 1
//Codeforces 96A
//Joey Massoni, Mandy Roche and Pauline Callejas

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		 
		if( s.contains("0000000") || s.contains("1111111")){

			System.out.println("YES");
		}
		
		else{
		
			System.out.println("NO");
		}
	}		
}