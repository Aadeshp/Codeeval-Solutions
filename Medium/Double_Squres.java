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
        int lim = input.nextInt();
        
        while (input.hasNextInt()) {
            int s = input.nextInt();
            System.out.println(numberOfDoubleSquares(s));
        }
    }
    
    private static int numberOfDoubleSquares (int num) {
        double sqrt = Math.sqrt(num / 2);
        int count = 0;
        
        for (int x = 0; x <= sqrt; x++) {
            int sq = x * x;
            int diff = num - sq;
            
            if (diff > 0) {
                int rt = (int)Math.sqrt(diff);
                if (diff == (rt * rt)) 
                    count++;
            }
        }
        
        return count;
    }
}