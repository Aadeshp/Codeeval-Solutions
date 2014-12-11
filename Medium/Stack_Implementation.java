import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] nums = input.nextLine().split(" ");
            int[] ints = new int[nums.length];
            
            for (int x = 0; x < nums.length; x++)
                ints[x] = Integer.parseInt(nums[x]);
            
            Stack<Integer> intStack = new Stack<Integer>();
            
            for (int x : ints)
                intStack.push(x);
            
            boolean flag = true;
            while (!intStack.isEmpty()) {
                int x = intStack.pop();
                
                if (flag)
                    System.out.print(x + " ");
                
                flag = !flag;
            }
            
            System.out.println();
        }
    }
}