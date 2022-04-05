
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (input.equals("")) {
                break;
            }
            
            for (int i = 1; i < pieces.length; i = i + 2) {
                if (Integer.valueOf(pieces[i]) > oldest) {
                    oldest = Integer.valueOf(pieces[i]);
                }
                
            }
            


        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
