//CodeForces 312A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		
        
        int numOfSentences = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < numOfSentences; i++){
            
            String sentence = in.nextLine();
            
            if(sentence.startsWith("miao.")){
                if(sentence.endsWith("lala.")){
                    System.out.println("OMG>.< I don't know!");
                } else {
                    System.out.println("Rainbow's");
                }
                
            }else if(sentence.endsWith("lala.")){
                System.out.println("Freda's");
                
            } else {
                System.out.println("OMG>.< I don't know!");
                
            }

        }

    }
}