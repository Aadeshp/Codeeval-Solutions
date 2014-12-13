import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            String s = input.nextLine();
            String p1 = "";
            String p2 = "";
            
            int temp = 0;
            for (int x = 0; x < s.length(); x++) {
                if (s.charAt(x) == ')') {
                    p1 = s.substring(1, x);
                    temp = x + 3;
                    p2 = s.substring(temp, s.length() - 1);
                    break;
                }
            }
            
            String[] s1 = p1.split(",");
            String[] s2 = p2.split(",");
            
            Point point1 = new Point(Float.parseFloat(s1[0]), Float.parseFloat(s1[1]));
            Point point2 = new Point(Float.parseFloat(s2[0]), Float.parseFloat(s2[1]));
            
            System.out.println(point1.distanceFromPoint(point2));
        }
    }
    
    static class Point {
        float x;
        float y;
        
        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }
        
        public int distanceFromPoint(Point p2) {
            float x2 = p2.x;
            float y2 = p2.y;
            
            return (int)Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2));
        }
    }
}