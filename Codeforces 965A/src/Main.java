
import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author joeym
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double people = in.nextInt();
        double planesPerPerson = in.nextInt();
        double planesPerSheet = in.nextInt();
        double sheetsPerPack = in.nextInt();

        double sheetsPerPerson = Math.ceil(planesPerPerson / planesPerSheet);
        double totalSheetsNeeded = people * sheetsPerPerson;
        double totalPacksNeeded = 0;

        if(totalSheetsNeeded % sheetsPerPack == 0) {
            
            totalPacksNeeded = totalSheetsNeeded / sheetsPerPack;
            
        } else {
            
            totalPacksNeeded = (totalSheetsNeeded / sheetsPerPack) + 1;
            
        }
        
//        System.out.println(sheetsPerPerson);
//        System.out.println(totalSheetsNeeded);
        System.out.println((int)totalPacksNeeded);

    }

}
