//CodeForces 342A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		
        int total = in.nextInt();
        int[] numbers = new int[total];
        
        for (int i = 0; i < total; i++){
            
            numbers[i] = in.nextInt();
            
        }
        
        //System.out.println(total);
        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));
        
        
        outer:
        for(int base = 0; base < numbers.length; base++){
            
            int first = numbers[base];
            //System.out.println(first);
            
            for(int compare1 = 0; compare1 < numbers.length; compare1++){

                if(first != numbers[compare1]){
                    
                    if(numbers[compare1] % first == 0){
                       
                        int second = numbers[compare1];
                        //System.out.println(first + " " + second);

                        for (int compare2 = numbers[compare1]; compare2 < numbers.length; compare2++){
                            
                            if(second != numbers[compare2]){
                                
                                if(numbers[compare2] % second == 0){
                                    
                                    int third = numbers[compare2];
                                    numbers[compare2] = -1;
                                    numbers[compare1] = -1;
                                    numbers[base] = -1;
                                    
                                    System.out.println(first + " " + second + " " + third);
                                    ///System.out.println(Arrays.toString(numbers));
                                    
                                    List<Integer> shorterList = new ArrayList<>();
                                    
                                    for (int i : numbers) {
                                        shorterList.add(i);
                                    }
                                    
                                    shorterList.removeAll(Arrays.asList(-1));  
                                    //System.out.println(shorterList);
                                    
                                    numbers = new int[shorterList.size()];

                                    for(int i = 0; i < shorterList.size(); i++) {
                                        
                                        numbers[i] = shorterList.get(i);
                                        
                                    }
                                    
                                    System.out.println(Arrays.toString(numbers));
                                    
                                    break; 
                                    
                                }
                            } 
                        }
                    } 
                } 
            }
        }
    }
}