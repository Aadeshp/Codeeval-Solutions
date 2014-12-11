/* Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
*/

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