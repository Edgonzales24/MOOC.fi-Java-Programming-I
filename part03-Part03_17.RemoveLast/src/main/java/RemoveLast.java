
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("there");
        strings.add("world");
        
        System.out.println(strings);
        
        removeLast(strings);
        
        System.out.println(strings);
        
        removeLast(strings);
        
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        int top = strings.size() - 1;
        if (top >= 0) {
            strings.remove(top);
        }
    }

}
