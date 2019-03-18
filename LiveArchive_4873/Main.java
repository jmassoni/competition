//Contest 1
//LiveArchive 4873
//Joey Massoni, Mandy Roche and Pauline Callejas

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String num = in.next();
		int number = Integer.parseInt(num);
		
		for(int i = 1; i <= number; i++){
			
			String dataSet = in.next();
			System.out.print(dataSet);
			
			int ttt = 0;
			int tth = 0;
			int tht = 0;
			int thh = 0;
			int htt = 0;
			int hth = 0;
			int hht = 0;
			int hhh = 0;

			int first = 0;
			int last = 3;

			String tosses = in.next();

			while (last <= 40){
				if (tosses.substring(first, last).equals("TTT")){
					ttt++;
				}
				
				if (tosses.substring(first, last).equals("TTH")){
					tth++;
				}

				if (tosses.substring(first, last).equals("THT")){
					tht++;
				}

				if (tosses.substring(first, last).equals("THH")){
					thh++;
				}
				
				if (tosses.substring(first, last).equals("HTT")){
					htt++;
				}

				if (tosses.substring(first, last).equals("HTH")){
					hth++;
				}				

				if (tosses.substring(first, last).equals("HHT")){
					hht++;
				}

				if (tosses.substring(first, last).equals("HHH")){
					hhh++;
				}

				first++;
				last++;
			}

			System.out.print( " " + ttt + " " );			
			System.out.print( tth + " " );
			System.out.print( tht + " " );
			System.out.print( thh + " " );
			System.out.print( htt + " " );
			System.out.print( hth + " " );
			System.out.print( hht + " " );
			System.out.println( hhh );

		}
	}
}