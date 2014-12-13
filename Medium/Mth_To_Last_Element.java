import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(findMthElementFromEnd(input.nextLine()));
        }
    }
    
    private static String findMthElementFromEnd(String s) {
        String[] arr = s.split(" ");
        int m = Integer.parseInt(arr[arr.length - 1]);
        
        if (m > arr.length - 1)
            return "";
            
        String result = "";
        
        int count = 0;
        int counter = arr.length - 2;
        while (count < m) {
            result = arr[counter--];
            count++;
        }
        
        return result;
    }
}