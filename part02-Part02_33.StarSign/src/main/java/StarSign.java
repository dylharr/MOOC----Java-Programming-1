
public class StarSign {

    public static void main(String[] args) {

        
        
        
        printStars(3);
        System.out.println("\n---"); 
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i<number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int max = 1;
        while (max <= size) {
            printStars(size);
            max++;
        }
    }

    public static void printRectangle(int width, int height) {
        int max = 1;
        while (max <=height) {
            printStars(width);
            max++;
        }
    }

    public static void printTriangle(int size) {
        int max = 1;
        while (max <= size) {
            printStars(max);
            max++;
        }
    }
}
