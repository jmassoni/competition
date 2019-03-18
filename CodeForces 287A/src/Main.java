//CodeForces 287A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char[][] board = new char[4][4];
        
        for(int i = 0; i < 4; i++) {
            String input = in.next();
            for(int j = 0; j < 4; j++) {
		board[i][j] = input.charAt(j);
            }       
	}
        
        //System.out.println(Arrays.deepToString(board));
        
        int square1 = 0;
        int square2 = 0;
        int square3 = 0;
        int square4 = 0;
        int square5 = 0;
        int square6 = 0;
        int square7 = 0;
        int square8 = 0;
        int square9 = 0;
        
        if(board[0][0] == board[0][1] && board[0][1] == board [1][0] && board[1][0] == board [1][1]){
            System.out.println("YES");
        } else if (board[0][1] == board[0][2] && board[0][2] == board [1][2] && board[1][2] == board [1][1]) {
            System.out.println("YES");
        } else if (board[0][2] == board[0][3] && board[0][3] == board [1][3] && board[1][3] == board [1][2]) {
            System.out.println("YES");
        } else if (board[1][2] == board[1][3] && board[1][3] == board [2][3] && board[2][3] == board [2][2]) {
            System.out.println("YES");
        } else if (board[2][2] == board[2][3] && board[2][3] == board [3][3] && board[3][3] == board [3][2]) {
            System.out.println("YES");
        } else if (board[2][1] == board[2][2] && board[2][2] == board [3][2] && board[3][2] == board [3][1]) {
            System.out.println("YES");
        } else if (board[2][0] == board[2][1] && board[2][1] == board [3][1] && board[3][1] == board [3][0]) {
            System.out.println("YES");
        } else if (board[1][0] == board[1][1] && board[1][1] == board [2][1] && board[2][1] == board [2][0]) {
            System.out.println("YES");
        } else if (board[1][1] == board[1][2] && board[1][2] == board [2][2] && board[2][2] == board [2][1]) {
            System.out.println("YES");
        } else {
            
            
            if(board[0][0] == board[0][1]){
                square1++;
            }
            if(board[0][0] == board[1][0]){
                square1++;
            }
            if(board[0][0] == board[1][1]){
                square1++;
            }
            
            
            if(board[0][1] == board[0][2]){
                square2++;
            }
            if(board[0][1] == board[1][2]){
                square2++;
            }
            if(board[0][1] == board[1][1]){
                square2++;
            }
            
            
            if(board[0][2] == board[0][3]){
                square3++;
            }
            if(board[0][2] == board[1][3]){
                square3++;
            }
            if(board[0][2] == board[1][2]){
                square3++;
            }
            
            
            if(board[1][2] == board[1][3]){
                square4++;
            }
            if(board[1][2] == board[2][3]){
                square4++;
            }
            if(board[1][2] == board[2][2]){
                square4++;
            }
            
            
            if(board[2][2] == board[2][3]){
                square5++;
            }
            if(board[2][2] == board[3][3]){
                square5++;
            }
            if(board[2][2] == board[3][2]){
                square5++;
            }
            
            
            if(board[2][1] == board[2][2]){
                square6++;
            }
            if(board[2][1] == board[3][2]){
                square6++;
            }
            if(board[2][1] == board[3][1]){
                square6++;
            }
            
            
            if(board[2][0] == board[2][1]){
                square7++;
            }
            if(board[2][0] == board[3][1]){
                square7++;
            }
            if(board[2][0] == board[3][0]){
                square7++;
            }
            
            
            if(board[1][0] == board[1][1]){
                square8++;
            }
            if(board[1][0] == board[2][1]){
                square8++;
            }
            if(board[1][0] == board[2][0]){
                square8++;
            }
            
            
            if(board[1][1] == board[1][2]){
                square9++;
            }
            if(board[1][1] == board[2][2]){
                square9++;
            }
            if(board[1][1] == board[2][1]){
                square9++;
            }

        }
        
        int total = square1 + square2 + square3 + square4 + square5 + square6
                + square7 + square8 + square9;

        
        if(square1 == 1 && square2 == 1 && square3 == 1 && square4 == 1
                && square5 == 1 && square6 == 1 && square7 == 1
                && square8 == 1 && square9 == 1){
            System.out.println("NO");
        } else if (total == 0) {
            //do nothing
        } else {
            System.out.println("YES");
        }
    }
}