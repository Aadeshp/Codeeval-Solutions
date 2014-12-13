import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{
           put('a', 10);
           put('b', 11);
           put('c', 12);
           put('d', 13);
           put('e', 14);
           put('f', 15);
        }};
        
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(convertToDecimal(input.nextLine(), map));
        }
    }
    
    private static int convertToDecimal (String s, HashMap<Character, Integer> map) {
        int sum = 0;
        int m = s.length() - 1;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c))
                sum += Character.getNumericValue(c) * Math.pow(16, m--);
            else
                sum += map.get(c) * Math.pow(16, m--);
        }
        
        return sum;
    }
}