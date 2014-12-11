import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] line = input.nextLine().split(",");
            String s = line[0];
            String e = line[1];
            
            int count = e.length() - 1;
            
            for (int x = s.length() - 1; x >= 0; x--) {
                if (count < 0)
                    break;
                    
                if (s.charAt(x) == e.charAt(count))
                    count--;
                else
                    break;
            }
            
            if (count == -1)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
