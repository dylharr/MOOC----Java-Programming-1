
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(3);
        list.add(6);
        list.add(8);
        int sum = sum(list);
        System.out.println(sum);
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1;
        }
        
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        return sum;
    }

}
