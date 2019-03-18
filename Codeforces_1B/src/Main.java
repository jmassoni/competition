
import static java.lang.Integer.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int totalConversions = in.nextInt();

        for (int i = 0; i < totalConversions; i++) {

            String coordinate = in.next();

            if (coordinate.charAt(0) == ('R')) {

                String[] r = coordinate.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");


                if (r.length > 2) {

                    String[] part = coordinate.split("(?<=\\D)(?=\\d)");
                    String[] secondPart = part[1].split("(?<=\\d)(?=\\D)");

                    int row = parseInt(secondPart[0]);
                    int col = parseInt(part[2]);

                    StringBuilder convertedCol = new StringBuilder();

                    while (col > 0) {

                        int rem = col % 26;

                        if (rem == 0) {
                            convertedCol.append("Z");
                            col = (col / 26) - 1;
                        } else {
                            convertedCol.append((char) ((rem - 1) + 'A'));
                            col = col / 26;
                        }
                    }

                    System.out.println(convertedCol.reverse() + "" + row);

                } else {

                    int num = 0;
                    String[] part = coordinate.split("(?<=\\D)(?=\\d)");

                    for (int j = 0; j < part[0].length(); j++) {

                        num = (num * 26) + (part[0].charAt(j) - 64);
                    }

                    System.out.println("R" + part[1] + "C" + num);
                }

            } else {

                int num = 0;
                String[] part = coordinate.split("(?<=\\D)(?=\\d)");

                for (int j = 0; j < part[0].length(); j++) {

                    num = (num * 26) + (part[0].charAt(j) - 64);
                }

                System.out.println("R" + part[1] + "C" + num);

            } //end else

        } //end for

    } //end class

} //end main
