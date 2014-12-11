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
            String cn = input.nextLine();
            boolean ifDouble = false;
            int sum = 0;
            
            for (int x = cn.length() - 1; x >= 0; x--) {
                if (cn.charAt(x) == ' ')
                    continue;
                    
                int n = Character.getNumericValue(cn.charAt(x));
                
                if (ifDouble) {
                    int d = n * 2;
                    
                    if (String.valueOf(d).length() > 1) {
                        while (d > 0) {
                            sum += (d % 10);
                            d /= 10;
                        }
                    } else {
                        sum += d;
                    }
                } else {
                    sum += n;
                }
                    
                ifDouble = !ifDouble;
            }
            
            if (sum % 10 == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}