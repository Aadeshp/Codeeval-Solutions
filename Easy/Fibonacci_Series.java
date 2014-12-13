import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextInt()) {
            System.out.println(findFibonacciTerm(input.nextInt()));
        }
    }
    
    private static int findFibonacciTerm(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
            
        int[] series = new int[n];
        series[0] = 1;
        series[1] = 1;
        
        for (int x = 2; x < n; x++) {
            series[x] = series[x - 1] + series[x - 2];
        }
        
        return series[n - 1];
    }
}