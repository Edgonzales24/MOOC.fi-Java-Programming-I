
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String full = scanner.nextLine();
            String[] inputs = full.split(" ");
            if(full.equals("")) {
                    break;
                }

            for (String input : inputs) {
                System.out.println(input);
                
            }
        }

    }
}
