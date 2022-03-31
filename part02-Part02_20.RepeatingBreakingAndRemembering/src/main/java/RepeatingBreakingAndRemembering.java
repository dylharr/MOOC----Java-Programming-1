
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int evenNum = 0;
        int oddNum = 0;
        System.out.println("Give numbers:");
        
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (input % 2 == 0) {
                evenNum++;
            }
            if (input % 2 != 0) {
                oddNum++;
            }
            sum = sum + input;
            numbers++;
            
        }
        double average = sum / (double) numbers;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd " + oddNum);

    }
}
