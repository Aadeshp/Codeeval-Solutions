/* Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        int limit = input.nextInt();
        List<String> strings = new ArrayList<String>();
        
        while (input.hasNextLine())
            strings.add(input.nextLine());
            
        List<String> sortedStrings = findLongestStrings(strings, limit);
        
        for (int x = 0; x < limit; x++)
            System.out.println(sortedStrings.get(x));
    }
    
    private static List<String> findLongestStrings(List<String> strings, int limit) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String s : strings)
            map.put(s, s.length());
            
        CustomComparer cc = new CustomComparer(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(cc);
        sortedMap.putAll(map);
        
        List<String> sortedStrings = new ArrayList<String>();
        for (String s : sortedMap.keySet())
            sortedStrings.add(s);
            
        return sortedStrings;
    }
    
    private static class CustomComparer implements Comparator<String> {
        Map<String, Integer> base;
        
        public CustomComparer(Map<String, Integer> base) {
            this.base = base;
        }
        
        public int compare(String a, String b) {
            int c = base.get(b).compareTo(base.get(a));
            
            if (c == 0)
                return -1;
            else
                return c;
        }
    }
}