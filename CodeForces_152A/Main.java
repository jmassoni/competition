//CodeForces 152A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		int x = 0;
		
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++) {
				
				
				 
				if(i == 0 || i == cols || j == 0 || j == rows){
					
					x = 2;
					
				} else {
					
					x = 4;
				}
				
			}			
		}
		
		System.out.println("\n" + x);
	}
}