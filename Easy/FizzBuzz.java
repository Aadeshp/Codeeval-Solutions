import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] nums = input.nextLine().split(" ");
            int f = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int l = Integer.parseInt(nums[2]);
            
            for (int x = 1; x <= l; x ++) {
                if (x % f == 0)
                    System.out.print("F");
                if (x % b == 0)
                    System.out.print("B");
                if (x % b != 0 && x % f != 0)
                    System.out.print(x);
                
                
                System.out.print(" ");
            }
            
            System.out.print("\n");
        }
    }
}