//CodeForces 131B
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		
        int numOfUsers = in.nextInt();
        double[] scores = new double[numOfUsers];
        
        for (int i = 0; i < numOfUsers; i++){
            
            scores[i] = in.nextInt();
            
        }
        
        Arrays.sort(scores);
        
        //System.out.println(Arrays.toString(scores));
        
        double negTens = 0;
        double negNines = 0;
        double negEights = 0;
        double negSevens = 0;
        double negSixes = 0;
        double negFives = 0;
        double negFours = 0;
        double negThrees = 0;
        double negTwos = 0;
        double negOnes = 0;
        double zeros = 0;
        double ones = 0;
        double twos = 0;
        double threes = 0;
        double fours = 0;
        double fives = 0;
        double sixes = 0;
        double sevens = 0;
        double eights = 0;
        double nines = 0;
        double tens = 0;
        
        for (int i = 0; i < numOfUsers;i++){
            
            if(scores[i] == -10){  
                negTens++;
            } else if(scores[i] == -9){
                negNines++;
            } else if(scores[i] == -8){
                negEights++;
            } else if(scores[i] == -7){
                negSevens++;
            } else if(scores[i] == -6){
                negSixes++;
            } else if(scores[i] == -5){
                negFives++;
            } else if(scores[i] == -4){
                negFours++;
            } else if(scores[i] == -3){
                negThrees++;
            } else if(scores[i] == -2){
                negTwos++;
            } else if(scores[i] == -1){
                negOnes++;
            } else if(scores[i] == 0){
                zeros++;
            } else if(scores[i] == 1){
                ones++;
            } else if(scores[i] == 2){
                twos++;
            } else if(scores[i] == 3){
                threes++;
            } else if(scores[i] == 4){
                fours++;
            } else if(scores[i] == 5){
                fives++;
            } else if(scores[i] == 6){
                sixes++;
            } else if(scores[i] == 7){
                sevens++;
            } else if(scores[i] == 8){
                eights++;
            } else if(scores[i] == 9){
                nines++;
            } else if(scores[i] == 10){
                tens++;
            }
            
        }
        
        double total = 0;
        
        total += (negTens * tens);
        total += (negNines * nines);
        total += (negEights * eights);
        total += (negSevens * sevens);
        total += (negSixes * sixes);
        total += (negFives * fives);
        total += (negFours * fours);
        total += (negThrees * threes);
        total += (negTwos * twos);
        total += (negOnes * ones);
        
        double totalZeros = 0;
        
        for(double i = (zeros - 1); i > 0 ; i--){    
           
            totalZeros += i;
        } 
       
        total += totalZeros;
        DecimalFormat backToInt = new DecimalFormat("#");
        
        
        System.out.println(backToInt.format(total));

    }
}