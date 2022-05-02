
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            int num = 0;
            while (reader.hasNextLine()) {
                
                String row = reader.nextLine();
                if (Integer.valueOf(row) >= Integer.valueOf(lowerBound) &&
                        Integer.valueOf(row) <= Integer.valueOf(upperBound)) {
                        num = num + 1;
                }
                
            }
            System.out.println("Numbers: " + num);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        

    }

}
