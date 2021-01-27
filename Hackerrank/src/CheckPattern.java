import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CheckPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
          String result = "YES";
            if(isHavingLeadingZeroes(s)){
               result = "NO"; 
            }
            int f = s.charAt(0);
		    int sec = s.charAt(1);
            
            if(sec-f!=1){
                result = "NO";
            }
            System.out.println("YES");
        }
        
       
        
        
        
    }
    
    private static boolean isHavingLeadingZeroes(String input){
        Pattern p = Pattern.compile("0[1-9]");
		Matcher m = p.matcher("1205");
        return m.find();
    }
}
