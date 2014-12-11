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
        
        while (input.hasNextInt()) {
            int x = input.nextInt();
            String b = Integer.toBinaryString(x);
            
            int count = 0;
            for (char c : b.toCharArray()) {
                if (c == '1')
                    count++;
            }
            
            System.out.println(count);
        }
    }
}