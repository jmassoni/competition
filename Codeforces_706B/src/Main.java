import java.util.*;

public class Main {

   public static int binarySearch(int array[], int x) {

       int start = 0;
       int end = array.length - 1;
       int goal = x;
       
       while (start <= end) {
           
           int mid = (start + end) / 2;
           int cost = array[mid];
           
           if (goal < cost) {
               end = mid - 1;
               
           }
           if (goal > cost) {
               start = mid + 1;
               
           }

           if (goal == cost) {
//               if (mid == end) {
//                   return mid;
//               } else {
//                   if(array[mid] == array[mid + 1]) {
//                       start = mid;
//                   } else {
//                       return mid;
//                   }
//               }
                
                return mid;

           }

       }
       return -1;
   }

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int numShops = in.nextInt();
       int[] bottlesArray = new int[numShops];

       for (int i = 0; i < numShops; i++) {
           bottlesArray[i] = in.nextInt();
       }

       Arrays.sort(bottlesArray);

       System.out.println(Arrays.toString(bottlesArray));
       int numDays = in.nextInt();

//        int result;
       for (int i = 0; i < numDays ; i++) {

           int temp = in.nextInt();
           int result = binarySearch(bottlesArray, temp);

           System.out.println(result + 1);

       }

//        int[] dailyCoins = new int [numDays];
//        
//        for (int i = 0; i < numDays; i++) {
//            dailyCoins[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(bottlesArray));
//        System.out.println(Arrays.toString(dailyCoins));
//        int count = 0;
//        for (int i = 0; i < dailyCoins.length; i++) {
//            
//            for (int j = 0; j < bottlesArray.length; j++) {
//                
//                if(dailyCoins[i] >= bottlesArray[j]){
//                    count++;
//                }
//                
//            }
//            System.out.println(count);
//            count = 0;
//        }
   }// end of main
}// end of class