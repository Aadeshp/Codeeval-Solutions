import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] s = input.nextLine().split(" ");
            
            System.out.println(s[s.length - 2]);
        }
    }
}