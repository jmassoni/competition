
import java.util.*;
import java.lang.Integer;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        String binary = Integer.toBinaryString(number);


        System.out.println(Integer.bitCount(number));
    }

}
