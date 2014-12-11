import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String[] n = input.nextLine().split(" ");
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            
            for (String s : n) {
                int num = Integer.parseInt(s);
                
                if (map.containsKey(num))
                    map.put(num, map.get(num) + 1);
                else
                    map.put(num, 1);
            }
            
            int min = 10;
            for (Integer val : map.keySet()) {
                if (map.get(val) == 1)
                    if (val < min)
                        min = val;
            }
            
            if (min == 10)
                System.out.println(0);
            else {
                for (int x = 0; x < n.length; x++) {
                    if (Integer.parseInt(n[x]) == min)
                        System.out.println(x + 1);
                }
            }
        }
    }
}