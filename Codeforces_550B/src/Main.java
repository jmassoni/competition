
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numOfProblems = in.nextInt();
        int min = in.nextInt();
        int max = in.nextInt();
        int minDifference = in.nextInt();

        int[] problems = new int[numOfProblems];
        int count = 0;

        for (int i = 0; i < numOfProblems; i++) {

            problems[i] = in.nextInt();

        }

        System.out.println(subsets_bitMask_Optimized(problems, min, max, minDifference));

    }

    public static int subsets_bitMask_Optimized(int[] problems, int min, int max, int minDifference) {
        int size = 0;
        int count = 0;
        // mask will iterate through all 2^N subsets.
        for (int mask = 0; mask < (1 << problems.length); mask++) {
            // reset size
            size = 0;
            
            // Do something problem-specific with the subset.
            for (int k = 0; k < problems.length; k++) {
                if (isOn(mask, k)) {
                    size += problems[k];
                    
                    
                    if (size >= min && size <= max) {
                        if ((size - problems[k]) >= minDifference) {
                            count++;
                        }
                    }
                }
            }
            
           

        }
        return count;
    }

    public static boolean isOn(int mask, int pos) {
        return (mask & (1 << pos)) > 0;
    }

    public static int set(int mask, int pos) {
        return mask | (1 << pos);
    }
}
