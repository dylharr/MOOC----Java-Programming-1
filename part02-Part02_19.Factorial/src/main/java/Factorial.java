
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int num = 1;
        System.out.println("Give a number:");
        int endNum = Integer.valueOf(scanner.nextLine());
        
        while (num <= endNum) {
            factorial = factorial * num;
            num++;
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
