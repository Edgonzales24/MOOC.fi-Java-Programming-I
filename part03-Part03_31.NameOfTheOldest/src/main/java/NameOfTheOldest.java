
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = -1;
        String name = "";
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String [] list = input.split(",");
            int currentAge = Integer.valueOf(list[1]);
            if (oldest < currentAge) {
                name = list[0];
                oldest = currentAge;
            }
            
            
        }
        System.out.println("Name of the oldest: " + name);

    }
}
