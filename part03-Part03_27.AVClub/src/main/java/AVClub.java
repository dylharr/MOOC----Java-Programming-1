
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            String[] avPieces = input.split(" ");
            if ("".equals(input)) {
                break;
            }
            for (String avPiece : avPieces) {
                if (avPiece.contains("av")) {
                    System.out.println(avPiece);
                }
            }
        }


    }
}
