//URI 1114
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//String n = in.nextInt();
		int correct = 2002;
		
		
		while (in.hasNextInt() == true) {
			
			int n = in.nextInt();
			
			if ( n == correct ) {
				System.out.println("Acesso Permitido");
                                break;
			} else {
				System.out.println("Senha Invalida");
				
			}
			
		}		
		
                
	}
}
