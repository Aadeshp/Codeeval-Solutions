import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            boolean capitalize = true;
            
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (capitalize)
                        sb.append(Character.toUpperCase(c));
                    else
                        sb.append(Character.toLowerCase(c));
                        
                    capitalize = !capitalize;
                } else
                    sb.append(c);
            }
            
            System.out.println(sb.toString());
        }
    }
}