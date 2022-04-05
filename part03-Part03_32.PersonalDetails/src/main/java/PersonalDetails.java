
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = null;
        int longest = 0;
        int sum = 0;
        int count = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            
            if (input.equals("")) {
                break;
            }
            
            for (int i = 0; i < pieces.length; i = i + 2) {
                if (pieces[i].length() > longest) {
                    longest = pieces[i].length();
                    longestName = pieces[i];
                }
            }
            
            for (int i = 1; i < pieces.length; i = i + 2) {
                sum = sum + Integer.valueOf(pieces[i]);
                count = count + 1;
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
        
        

    }
}
