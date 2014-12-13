import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextInt()) {
            System.out.println(isHappyNumber(input.nextInt()));
        }
    }
    
    private static int isHappyNumber(int x) {
        String s = String.valueOf(x);
        HashSet<Integer> set = new HashSet<Integer>();
        int squaredDigits = 0;
        
        for (char c : s.toCharArray()) {
            squaredDigits += Math.pow(Character.getNumericValue(c), 2);
        }
        set.add(squaredDigits);
            
        while (squaredDigits != 1) {
            s = String.valueOf(squaredDigits);
            
            squaredDigits = 0;
            for (char c : s.toCharArray()) {
                squaredDigits += Math.pow(Character.getNumericValue(c), 2);
            }
            
            if (set.contains(squaredDigits))
                return 0;
            else
                set.add(squaredDigits);
        }
        
        return 1;
    }
}