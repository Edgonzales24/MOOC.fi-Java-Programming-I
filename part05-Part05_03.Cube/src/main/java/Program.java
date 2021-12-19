
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube test = new Cube(4);
        System.out.println(test.volume());
        System.out.println(test);
        
        System.out.println("");
        
        Cube c = new Cube(7); 
        System.out.println(c.toString());
    }
}
