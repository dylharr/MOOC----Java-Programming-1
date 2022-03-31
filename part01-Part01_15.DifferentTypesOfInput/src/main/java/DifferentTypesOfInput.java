
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        
        System.out.println("Give an integer:");
        int intNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        double doubleNumber = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + intNumber);
        System.out.println("You gave the double " + doubleNumber);
        System.out.println("You gave the boolean " + value);
        
        

        // Write your program here

    }
}
