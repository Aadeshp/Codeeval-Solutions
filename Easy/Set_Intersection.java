import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] integers = input.nextLine().split(";");
            Set<Integer> set1 = stringToSet(integers[0]);
            Set<Integer> set2 = stringToSet(integers[1]);
            
            SortedSet<Integer> result = new TreeSet<Integer>();
            
            for (Integer x : set1) {
                if (set2.contains(x) && !(result.contains(x))) {
                    result.add(x);
                }
            }
            
            Iterator<Integer> ir = result.iterator();
            
            while (ir.hasNext()) {
                System.out.print(ir.next());
                
                if (ir.hasNext()) {
                    System.out.print(",");
                }
            }
            
            System.out.print("\n");
        }
    }
    
    public static Set<Integer> stringToSet(String s) {
        String[] nums = s.split(",");
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (String n : nums) {
            set.add(Integer.parseInt(n));
        }
        
        return set;
    }
}