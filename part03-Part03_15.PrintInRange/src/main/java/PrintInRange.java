
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(-1);
        nums.add(5);
        System.out.println("The numbers in the range [0, 4]");
        printNumbersInRange(nums, 0, 4);
    }
    
    public static void printNumbersInRange(ArrayList<Integer>
            numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number >= lowerLimit && number <= upperLimit ) {
                System.out.println(number);
            }
        }
        
        
    }
    
}
