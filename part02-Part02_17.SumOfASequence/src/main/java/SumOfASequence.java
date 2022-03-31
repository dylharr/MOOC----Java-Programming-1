
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        System.out.println("Last number?");
        int endNum = Integer.valueOf(scanner.nextLine());
        
        while (num <= endNum) {
            sum = sum + num;
            num++;
        }
        System.out.println("The sum is " + sum);

    }
}
