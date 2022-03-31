
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int max = 1;
        while (max <= number) {
            System.out.print(" ");
            max++;
        }
    }

    public static void printTriangle(int size) {
        int space = size - 1;
        int max = 1;
        while (max <= size) {
            printSpaces(space);
            printStars(max);
            space--;
            max++;
        }
    }

    public static void christmasTree(int height) {
        int space = height - 1;
        int max = 1;
        while (max <= height) {
            printSpaces(space);
            printStars(max * 2 - 1);
            space--;
            max++;
        }
        for (int i = 1; i < 3; i++) {
            printSpaces(height - 2);
            printStars(3);        
        }
    }

    public static void main(String[] args) {
        

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
