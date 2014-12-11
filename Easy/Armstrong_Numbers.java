import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextInt()) {
            int n = input.nextInt();
            String s = Integer.toString(n);
            int sum = 0;
            for (int x = 0; x < s.length(); x++) {
                sum += Math.pow(Character.getNumericValue(s.charAt(x)), s.length());
            }
            
            if (sum == n)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}