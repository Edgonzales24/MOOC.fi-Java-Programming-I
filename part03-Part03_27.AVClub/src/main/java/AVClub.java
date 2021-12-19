
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String search = scanner.nextLine();
            String[] inputs = search.split(" ");
            if (search.equals("")) {
                break;
            }

            for (String input : inputs) {
                if (input.contains("av")) {
                    System.out.println(input);
                }
            }
        }
    }
}
