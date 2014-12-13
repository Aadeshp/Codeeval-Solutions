import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(findDuplicate(input.nextLine()));
        }
    }
    
    private static String findDuplicate(String s) {
        String[] arr = s.split(";");
        int max = Integer.parseInt(arr[0]);
        
        String[] stringNums = arr[1].split(",");
        HashSet<String> set = new HashSet<String>();
        
        for (String str : stringNums) {
            if (set.contains(str))
                return str;
            else
                set.add(str);
        }
        
        return null;
    }
}