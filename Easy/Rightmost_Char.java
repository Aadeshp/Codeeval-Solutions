import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner (new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] s = input.nextLine().split(",");
            String str = s[0];
            String ch = s[1];
            int index = -1;
            
            for (int x = 0; x < str.length(); x++) {
                if (String.valueOf(str.charAt(x)).equals(ch))
                    index = x;
            }
            
            System.out.println(index);
        }
    }
}