

import java.util.*;


public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        int pathSizeCurrent, pathSizeBest;
        
        Stack<Integer> pathCurrent, pathBest;
        int idxCurr, idxPrev;
        int [] objects, tracks, numTracksLeavingFrom;
        ArrayList<Integer> hotels = new ArrayList<>();
        
        
        
        n = in.nextInt();
        objects = new int[n+1];
        tracks = new int[n+1];
        
        numTracksLeavingFrom = new int[n+1];
        
        
        for (int i = 1; i <= n; i++){
            objects[i] = in.nextInt();
            
            if (objects[i] == 1){ 
                hotels.add(i);
            }    
            
        }
        for (int i = 1; i <= n; i++){
            tracks[i] = in.nextInt();
            
            numTracksLeavingFrom[tracks[i]]++;
            
        }
        
        for ( int i = 0; i < hotels.size(); i++){
            idxCurr = hotels.get(i);
            pathCurrent = new Stack<>();
            pathSizeCurrent = 1;
            pathCurrent.push(idxCurr);
            
            
            while (true){
                if(tracks[idxCurr] == 0 || numTracksLeavingFrom[tracks[idxCurr]] > 1){
                  break;  
                }
                else {
                    pathSizeCurrent++;
                    
                    pathCurrent.push(tracks[idxCurr]);
                    
                    idxCurr = tracks[idxCurr];
                    
                }
            }
            
            if (pathSizeCurrent > pathSizeBest){
             
                pathSizeBest = pathSizeCurrent;
                pathBest = pathCurrent;
            }
            
            
        }
        
        System.out.println(pathSizeBest);
        while(pathBest.size() > 0){
            System.out.println(pathBest.pop());  
        }
        
    }
    
}
