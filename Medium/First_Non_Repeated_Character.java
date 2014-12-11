import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
            
            for (int x = 0; x < s.length(); x++) {
                char c = s.charAt(x);
                
                if (freq.containsKey(c)) 
                    freq.put(c, freq.get(c) + 1);
                else
                    freq.put(c, 1);
            }
            
            for (int x = 0; x < s.length(); x++) {
                char c = s.charAt(x);
                
                if (freq.get(c) == 1) {
                    System.out.println(c);
                    break;
                }
            }
        }
    }
}
