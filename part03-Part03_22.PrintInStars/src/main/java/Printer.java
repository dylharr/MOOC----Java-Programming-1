
public class Printer {

    public static void main(String[] args) {
        
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int stars = array[i];
            int start = 0;
            while (start < stars) {
                System.out.print("*");
                start++;
            }
            System.out.println("");
        }
    }

}
