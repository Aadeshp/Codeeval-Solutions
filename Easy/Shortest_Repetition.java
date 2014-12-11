import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner (new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            HashSet<Character> set = new HashSet<Character>();
            
            for (char c : s.toCharArray()) {
                if (!(set.contains(c)))
                    set.add(c);
            }
            
            System.out.println(set.size());
        }
    }
}