
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] list = input.split(",");
            int currentAge = Integer.valueOf(list[1]);
            if (oldest < currentAge) {
                oldest = currentAge;
            }
        }
        System.out.print("Age of the oldest: " + oldest);
    }
}
