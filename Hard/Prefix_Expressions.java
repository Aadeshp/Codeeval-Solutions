import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            System.out.println((int)findValue(s));
        }
    }
    
    private static double findValue (String s) {
        String[] str = s.split(" ");
        Stack<Double> stack = new Stack<Double>();
        
        for (int x = str.length - 1; x >= 0; x--) {
            String temp = str[x];
            
            try {
                stack.push(Double.parseDouble(temp));
            } catch (NumberFormatException e) {
                double num1 = stack.pop();
                double num2 = stack.pop();
                
                if (temp.equals("+"))
                    stack.push(num1 + num2);
                else if (temp.equals("*"))
                    stack.push(num1 * num2);
                else if (temp.equals("/"))
                    stack.push(num1 / num2);
            }
        }
        
        return stack.peek();
    }
}