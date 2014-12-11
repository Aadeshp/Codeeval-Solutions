import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextLine()) {
            System.out.println(getMaxBeautyOfString(input.nextLine()));
        }
    }
    
    private static int getMaxBeautyOfString(String s) {
        HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
            
        for (char c : s.toCharArray()) {
            char ch = Character.toLowerCase(c);
            
            if (Character.isLetter(ch)) {
                if (occurrences.containsKey(ch))
                    occurrences.put(ch, occurrences.get(ch) + 1);
                else
                    occurrences.put(ch, 1);
            }
        }
        
        CustomComparer cc = new CustomComparer(occurrences);
        TreeMap<Character, Integer> sortedSet = new TreeMap<Character, Integer>(cc);
        sortedSet.putAll(occurrences);
        
        int sum = 0;
        int count = 26;
        for (char c : sortedSet.keySet()) {
            int occurrence = occurrences.get(c);
            sum += occurrence * count;
            count--;
        }
        
        return sum;
    }
    
    private static class CustomComparer implements Comparator<Character> {
        Map<Character, Integer> base;
        public CustomComparer (Map<Character, Integer> base) {
            this.base = base;
        }
        
        public int compare(Character a, Character b) {
            if (base.get(b).compareTo(base.get(a)) == 0)
                return -1;
            else
                return base.get(b).compareTo(base.get(a));
        }
    }
}
