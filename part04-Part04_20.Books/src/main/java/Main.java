import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int publishYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publishYear));
        }
        
        System.out.println();
        System.out.println("What information will be printed?");
        String print = scanner.nextLine();
        
        for (Book book : books) {
            if (print.equals("everything")) {
                System.out.println(book.toString());
            } else if (print.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
