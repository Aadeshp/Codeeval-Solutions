import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            StringBuilder sb = new StringBuilder();
            
            for (int x = 0; x < s.length(); x++) {
                if (Character.isLetter(s.charAt(x))) {
                    if (Character.isUpperCase(s.charAt(x)))
                        sb.append(Character.toLowerCase(s.charAt(x)));
                    else
                        sb.append(Character.toUpperCase(s.charAt(x)));
                } else
                    sb.append(s.charAt(x));
            }
            
            System.out.println(sb.toString());
        }
    }
}