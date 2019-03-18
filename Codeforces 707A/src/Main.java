//CodeForces 707A
//Joey Massoni, Amanda Roche, Pauline Callejas

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        Boolean bw = true;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                char pixel = in.next().charAt(0);
                if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                    bw = false;

                }
            }

        }
        
        if(bw == true) {
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }

    } 
}
