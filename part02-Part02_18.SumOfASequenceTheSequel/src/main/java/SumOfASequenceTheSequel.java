
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int startNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int endNum = Integer.valueOf(scanner.nextLine());
        
        while (startNum <= endNum) {
            sum = sum + startNum;
            startNum++;
        }
        System.out.println("The sum is " + sum);

    }
}
