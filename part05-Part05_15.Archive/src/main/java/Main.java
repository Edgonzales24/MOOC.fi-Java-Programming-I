
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<>();
        while (true) {
            System.out.println("Identifier?(empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            
            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Figure figure = new Figure(id,name);
            if (!(figures.contains(figure))) {
                figures.add(figure);
            }
        }
        System.out.println("==items==");
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
    }
}
