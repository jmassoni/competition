//CodeForces 144A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;
import java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int soldiers = in.nextInt();
		//System.out.println(soldiers);
		
		Integer[] lineOfSoldiers = new Integer[soldiers];
		
		for( int i = 0; i < soldiers; i++ ) {
			
			int nextUp = in.nextInt();
			lineOfSoldiers[i] = nextUp;
			//System.out.println(lineOfSoldiers[i]);
		}
		
		int min = Collections.min(Arrays.asList(lineOfSoldiers));
		int max = Collections.max(Arrays.asList(lineOfSoldiers));
		
		int mindex = Arrays.asList(lineOfSoldiers).lastIndexOf(min);
		int maxdex = Arrays.asList(lineOfSoldiers).indexOf(max);
		
		//System.out.println(min + " " + max);
		//System.out.println(mindex + " " + maxdex);
		
		int minstance = (soldiers-1) - mindex;
		int maxstance = maxdex - 1;
		
		int fin = 0;
		
		if (mindex < maxdex) {
			
			fin = minstance + maxstance;
			
		} else {
			
			fin = minstance + maxstance + 1;
			
		}
		//System.out.println(minstance + " " + maxstance);
		
		System.out.println(fin);
		
		
		
		//System.out.println(lineOfSoldiers);
		
	}
	
}