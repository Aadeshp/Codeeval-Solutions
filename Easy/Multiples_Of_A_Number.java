import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] nums = line.split(",");
            int x = Integer.parseInt(nums[0]);
            int n = Integer.parseInt(nums[1]);
            int sum = 0;
            
            while (x > sum) 
                sum += n;
            
            System.out.println(sum);
        }
    }
}