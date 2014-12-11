import java.util.*;
import java.io.*;

public class Main  {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        HashMap<String, Integer> map = new HashMap<String, Integer>() {{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        
        while (input.hasNextLine()) {
            String[] nums = input.nextLine().split(";");
            
            for (String s : nums) {
                System.out.print(map.get(s));
            }
            
            System.out.println();
        }
    }
}