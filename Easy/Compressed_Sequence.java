import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] nums = input.nextLine().split(" ");
            
            int count = 1;
            
            for (int x = 1; x < nums.length; x++) {
                if (!(nums[x].equals(nums[x - 1]))) {
                    System.out.print(count + " " + nums[x - 1] + " ");
                    count = 1;
                } else
                    count++;
            }
            
            System.out.println(count + " " + nums[nums.length - 1]);
        }
    }
}