import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            reverseGroups(s);
            System.out.println();
        }
    }
    
    private static void reverseGroups(String s) {
        String[] arr = s.split(";");
        int swap = Integer.parseInt(arr[1]) - 1;
        String[] nums = arr[0].split(",");
        
        String[] newSet = new String[nums.length];
        
        int counter = 0;
        int min = 0;
        int constantSwap = swap + 1;
        while (swap < nums.length) {
            for (int x = swap; x >= min; x--) {
                newSet[counter] = nums[x];
                counter++;
            }
            
            min = swap + 1;
            swap += constantSwap;
        }
        
        swap -= constantSwap;
        for (int x = swap + 1; x < nums.length; x++)
            newSet[x] = nums[x];
            
        for (int a = 0; a < newSet.length; a++) {
            if (a == newSet.length - 1)
                System.out.print(newSet[a]);
            else
                System.out.print(newSet[a] + ",");
        }
    }
}