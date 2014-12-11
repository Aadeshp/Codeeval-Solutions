import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] nums = input.nextLine().split(",");
            Set<Integer> numSet = new TreeSet<Integer>();
            
            for (int x = 0; x < nums.length; x++) {
                int temp = Integer.parseInt(nums[x]);
                if (!(numSet.contains(temp)))
                    numSet.add(temp);
            }
            
            int last = Integer.parseInt(nums[nums.length - 1]);
            numSet.remove(last);
            
            for (Integer n : numSet)
                System.out.print(n + ",");
                
            System.out.println(last);
        }
    }
}