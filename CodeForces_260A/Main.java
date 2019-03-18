
//CodeForces 260A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
	
        int g = 0;
        boolean lengtheningWorked = false;
           
        for (int i = 0; i <= 9; i++){

            g = (a*10) + i;

            if (g % b == 0) {

                lengtheningWorked = true;
                break;

            } 

        }
        
        if(lengtheningWorked == false){
            
            System.out.println(-1);
            
        } else {
            
            System.out.print(g);
            
            for (int oh = 0; oh < (n-1); oh++){
                System.out.print(0);
            }
            
        }    
            
    }
    
}