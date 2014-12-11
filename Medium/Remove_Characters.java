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

import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] in = input.nextLine().split(",");
            String s = in[0];
            String r = in[1].replaceAll(" ", "");
            char[] ch = r.toCharArray();

            for (char c : ch)
                s = s.replaceAll(String.valueOf(c), "");
            
            System.out.println(s);
        }
    }
}