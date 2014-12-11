import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        int sum = 0;
        
        while (input.hasNextInt())
            sum += input.nextInt();
            
        System.out.println(sum);
    }
}