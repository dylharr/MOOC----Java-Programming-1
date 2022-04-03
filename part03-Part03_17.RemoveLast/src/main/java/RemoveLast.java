
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Dylan");
        names.add("Chloe");
        names.add("Jesse");
        names.add("Layne");
        names.add("Merenya");
        names.add("Rocky");
        names.add("Hugh Jackman");
        removeLast(names);
        System.out.println(names);
                
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        int last = strings.size() - 1;
        strings.remove(last);
    }

}
