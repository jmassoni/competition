//CodeForces 711A
//Joey Massoni, Amanda Roche, Pauline Callejas

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        String seats = " ";
        Boolean replaced = false;
        String ans = "";
        
        for (int i = 0; i < rows; i++) {
            
           seats = in.next();
            if ((seats.charAt(0) == 'O' && seats.charAt(1) == 'O') || (seats.charAt(3) == 'O' && seats.charAt(4) == 'O')) {
                if (replaced == false) {
                    seats = seats.replaceFirst("OO", "++");
                    ans+= seats;
                    ans += "\n";
                    replaced = true;
                } else {
                    ans += seats;
                    ans += "\n";
                }
             
            } else {
                ans += seats;
                ans += "\n";
            }

        }
        if (replaced == true) {
            System.out.println("YES");
            System.out.println(ans);
        } else {
            System.out.println("NO");
        }

    }  // end main
} // end class
