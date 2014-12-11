import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] words = input.nextLine().split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (String w : words)
                stringBuilder.append(w.substring(0, 1).toUpperCase() + w.substring(1) + " ");
                
            System.out.println(stringBuilder.toString());
        }
    }
}