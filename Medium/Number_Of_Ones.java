import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextInt()) {
            int x = input.nextInt();
            String b = Integer.toBinaryString(x);
            
            int count = 0;
            for (char c : b.toCharArray()) {
                if (c == '1')
                    count++;
            }
            
            System.out.println(count);
        }
    }
}
