import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(findMissingAlphabets(input.nextLine()));
        }
    }
    
    private static String findMissingAlphabets (String s) {
        HashSet<Character> set = new HashSet<Character>();
        
        for (char c : s.toCharArray()) {
            if (c != ' ' && !set.contains(c))
                set.add(Character.toLowerCase(c));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch))
                sb.append(ch);
        }
        
        if (sb.toString().length() < 1)
            return "NULL";
        else
            return sb.toString();
    }
}