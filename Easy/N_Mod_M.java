import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] s = input.nextLine().split(",");
            int num = Integer.parseInt(s[0]);
            int div = Integer.parseInt(s[1]);
            
            int d = (int)(num / div);
            int mod = num - (div * d);
            
            System.out.println(mod);
        }
    }
}