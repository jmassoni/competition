//CodeForces 287A
//Joey Massoni, Amanda Roche, Pauline Callejos

import java.util.*;
import java.util.regex.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fix = in.next();

        
        String regex = "(.)\\1{1,}";
        String replace = "--";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(fix);
        
        fix = m.replaceAll("aa");
        
        System.out.println(fix);
      
        
    }
    
}