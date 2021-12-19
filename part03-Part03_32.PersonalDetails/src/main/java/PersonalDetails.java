
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = -1;
        double sum = 0;
        int counter = 0;
        String largestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String [] info = input.split(",");
            String name = info[0];
            int birthYear = Integer.valueOf(info[1]);
            sum += birthYear;
            counter++;
            if (longest < name.length()) {
                longest = name.length();
                largestName = info[0];
            }
        }
        System.out.println("Longest name: " + largestName);
        System.out.println("Average of the birth years: " + sum / counter);

    }
}
