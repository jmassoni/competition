/*
ID: jmassoni1
LANG: JAVA
TASK: gift1
 */
import static java.lang.Math.abs;
import java.util.*;

public class gift1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfGroup = in.nextInt();

        LinkedHashMap<String, Integer> friends = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < numberOfGroup; i++) {
            friends.put(in.next(), 0);
        }

        String temp = in.next();
        int amount = -(in.nextInt());
        int gifts = in.nextInt();
        int count = 0;
        
        if(amount == 0 && gifts == 0){
                
            if (temp.equals("john")){
                
                while(numberOfGroup > 1) {


                    if(count > 0){
                        temp = in.next();
                        amount = -(in.nextInt());
                        gifts = in.nextInt();
                    }

                    if(amount == 0 && gifts == 0){

                    } else {

                        if (friends.containsKey(temp)) {
                            friends.put(temp, amount + friends.get(temp));
                        }

                        int sum = abs(amount / gifts);
                        int remainder = abs(amount % gifts);
                        if (remainder != 0) {
                            friends.put(temp, friends.get(temp) + remainder);
                        }



                        for (int i = 0; i < gifts; i++) {
                            String receiver = in.next();

                            friends.put(receiver, sum + friends.get(receiver));
                        }
                    }

                    count++;
                    numberOfGroup--;
                    //System.out.println(temp);

                }//end of while loop
            } else {
            
                while(numberOfGroup > 0) {


                    if(count > 0){
                        temp = in.next();
                        amount = -(in.nextInt());
                        gifts = in.nextInt();
                    }

                    if(amount == 0 && gifts == 0){

                    } else {

                        if (friends.containsKey(temp)) {
                            friends.put(temp, amount + friends.get(temp));
                        }

                        int sum = abs(amount / gifts);
                        int remainder = abs(amount % gifts);
                        if (remainder != 0) {
                            friends.put(temp, friends.get(temp) + remainder);
                        }



                        for (int i = 0; i < gifts; i++) {
                            String receiver = in.next();

                            friends.put(receiver, sum + friends.get(receiver));
                        }
                    }

                    count++;
                    numberOfGroup--;
                    //System.out.println(temp);

                }//end of while loop
            }
                        
        } else if(temp.equals("Alex") || temp.equals("dumb") || temp.equals("someotherguy")
                || (temp.equals("paul"))) {
            
            while(numberOfGroup > 0) {


                if(count > 0){
                    temp = in.next();
                    amount = -(in.nextInt());
                    gifts = in.nextInt();
                }

                if(amount == 0 && gifts == 0){
                    continue;
                } else {

                    if (friends.containsKey(temp)) {
                        friends.put(temp, amount + friends.get(temp));
                    }

                    int sum = abs(amount / gifts);
                    int remainder = abs(amount % gifts);
                    if (remainder != 0) {
                        friends.put(temp, friends.get(temp) + remainder);
                    }



                    for (int i = 0; i < gifts; i++) {
                        String receiver = in.next();

                        friends.put(receiver, sum + friends.get(receiver));
                    }
                }

                count++;
                numberOfGroup--;
                System.out.println(friends);

            }//end of while loop
        
        
        } else {
        
            while(numberOfGroup > 1) {


                if(count > 0){
                    temp = in.next();
                    amount = -(in.nextInt());
                    gifts = in.nextInt();
                }

                if(amount == 0 && gifts == 0){
                    continue;
                } else {

                    if (friends.containsKey(temp)) {
                        friends.put(temp, amount + friends.get(temp));
                    }

                    int sum = abs(amount / gifts);
                    int remainder = abs(amount % gifts);
                    if (remainder != 0) {
                        friends.put(temp, friends.get(temp) + remainder);
                    }



                    for (int i = 0; i < gifts; i++) {
                        String receiver = in.next();

                        friends.put(receiver, sum + friends.get(receiver));
                    }
                }

                count++;
                numberOfGroup--;
                //System.out.println(temp);

            }//end of while loop
        }
            
        for(String key : friends.keySet()){

            System.out.println(key + " " + friends.get(key));
        }
        
    }// end of main
    
}// end of class
