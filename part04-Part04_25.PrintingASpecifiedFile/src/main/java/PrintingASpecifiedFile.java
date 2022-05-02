
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String print = scanner.nextLine(); 
        try (Scanner read = new Scanner(Paths.get(print))) {
            
            while (read.hasNextLine()) {
            
            String row = read.nextLine();
            System.out.println(row);
        }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
            
         

        
    }
}
