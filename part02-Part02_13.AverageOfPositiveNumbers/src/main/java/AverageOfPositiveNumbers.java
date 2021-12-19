
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int positive = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                counter = counter + 1;
                positive = positive + num;
            }
        }
        if (counter > 0) {
            System.out.println(1.0 * positive / counter);
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } 
    }
}
