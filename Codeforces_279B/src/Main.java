
import java.util.*;

public class Main {

    static int smallestSubWithSum(int arr[], int n, int x) {
        int len = 0;
        int max_len = 0;

        for (int start = 0; start < n; start++) {

            int curr_sum = arr[start];
            len = 1;

            if (curr_sum > x) {
                len = 0;
            } else if (curr_sum == x) {
                len = 1;
            } else {

                for (int end = start + 1; end < n; end++) {
                    // add last element to current sum
                    curr_sum += arr[end];

                    if (curr_sum > x) {
                        break;
                    } else if (curr_sum == x) {
                        len++;
                        break;
                    }
                    len = end - start + 1;

                }
//            System.out.println(curr_sum);
//            System.out.println(len);
            }
            if (len > max_len) {
                max_len = len;
            }

        }
        return max_len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numBooks = in.nextInt();
        int freeMinutes = in.nextInt();

        int[] books = new int[numBooks];
        for (int i = 0; i < numBooks; i++) {
            books[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i];
        }

        if (sum <= freeMinutes) {
            System.out.println(books.length);
        } else if (books.length == 1 && sum > freeMinutes) {
            System.out.println(0);
        } else {

            int test = smallestSubWithSum(books, books.length, freeMinutes);
            System.out.println(test);
        
        }
    }// end of main	
}// end of class
