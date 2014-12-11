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
        
        while (input.hasNextInt()) {
            int[] vals = reverseAndAddToFindPalindrome(input.nextInt());
            
            for (int x = 0; x < vals.length; x++)
                System.out.print(vals[x] + " ");
                
            System.out.println();
        }
    }
    
    private static int[] reverseAndAddToFindPalindrome (int num) {
        int count = 0;
        boolean isPalindrome = false;
        int start = num;
        int sum = 0;
        
        while (!isPalindrome) {
            count++;
            sum = 0;
            
            String s = String.valueOf(start);
            String reversed = new StringBuilder(s).reverse().toString();
            
            sum = Integer.parseInt(s) + Integer.parseInt(reversed);
            String sumString = String.valueOf(sum);
            String sumStringReversed = new StringBuilder(sumString).reverse().toString();
            
            if (sumString.equals(sumStringReversed))
                isPalindrome = true;
            else
                start = sum;
        }
        
        return new int[] { count, sum };
    }
}