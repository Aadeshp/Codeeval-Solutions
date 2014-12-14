import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] s = input.nextLine().split(",");
            String s1 = s[0];
            String s2 = s[1];
            
            String curr = s2;
            curr = shiftString(curr);
            
            boolean match = false;
            while (!curr.equals(s2)) {
                if (curr.equals(s1)) {
                    match = true;
                    break;
                }
                
                curr = shiftString(curr);
            }
            
            if (match)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
    
    private static String shiftString (String str) {
        return str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);

    }
}