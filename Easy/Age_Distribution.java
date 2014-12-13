import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File(args[0]));
        
        while (input.hasNextInt()) {
            System.out.println(getPhraseFromAge(input.nextInt()));
        }
    }
    
    private static String getPhraseFromAge(int age) {
        if (age >= 0 && age <= 2)
            return "Still in Mama's arms";
        else if (age == 3 || age == 4)
            return "Preschool Maniac";
        else if (age >= 5 && age <= 11)
            return "Elementary school";
        else if (age >= 12 && age <= 14)
            return "Middle school";
        else if (age >= 15 && age <= 18)
            return "High school";
        else if (age >= 19 && age <= 22)
            return "College";
        else if (age >= 23 && age <= 65)
            return "Working for the man";
        else if (age >= 66 && age <= 100)
            return "The Golden Years";
        else
            return "This program is for humans";
    }
}