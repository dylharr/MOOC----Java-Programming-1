
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = null;
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            
            if (input.equals("")) {
                break;
            }
            
            for (int i = 1; i < pieces.length; i = i + 2) {
                if (oldest < Integer.valueOf(pieces[i])) {
                    oldest = Integer.valueOf(pieces[i]);
                    oldestName = pieces[i - 1];
                    
                }
            }
            
        }
        System.out.println("Name of the oldest: " + oldestName);
        
        


    }
}
