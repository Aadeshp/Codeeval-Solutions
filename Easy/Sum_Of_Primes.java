public class Main {
    public static void main (String[] args) {
        int sum = 0;
        int x = 1;
        int numOfPrimes = 0;
        
        while (numOfPrimes < 1000) {
            int count = 0;
            
            for (int y = x; y > 1; y--) {
                if (x % y == 0)
                    count ++;
            }
            
            if (count == 1) {
                sum += x;
                numOfPrimes++;
            }
                
            x++;
        }
        System.out.println(sum);
    }
}