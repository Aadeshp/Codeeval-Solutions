import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(findLongestString(input.nextLine()));
        }
    }
    
    private static String findLongestString(String s) {
        String[] words = s.split(" ");
        String maxString = words[0];
        for (int x = 1; x < words.length; x++) {
            if (words[x].length() > maxString.length()) {
                maxString = words[x];
            }
        }
        
        return maxString;
    }
}