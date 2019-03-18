//CodeForces 266C
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int numberOfOnes = size - 1;
        int[][] matrix = new int[size][size];
        boolean noChangesNeeded = true;
        int rowWithoutOnes = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 0;
            }
        }

        for (int i = 1; i < size; i++) {
            int row = in.nextInt();
            int col = in.nextInt();
            //System.out.println(row + " " + col);
            matrix[row - 1][col - 1] = 1;

            if (row > col) {

            } else {
                noChangesNeeded = false;
            }
        }

        //accounts for grid with all ones already below diagonal
        if (noChangesNeeded == true) {
            System.out.println("0");
        }

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                //search for row filled with only zeros
                //then swap that row with row one using swapRows method
            }
        }

        //look at row 2 (row index 1) and use swapCols to get row all the way 
        //over to far left (column 1 at column index 0)
        //then swap row 2 with row n (counter set to n)
        //do this continously to row 2, decrementing a counter initialized at n
        //every time.
        //eventually all ones will be right below diagonal.
        //System.out.println(rowWithoutOnes);
        System.out.println(Arrays.deepToString(matrix));

    }

    public int swapRows(int row, int row2) {

        return 0;
    }

    public int swapCols(int col, int col2) {

        return 0;
    }

}
