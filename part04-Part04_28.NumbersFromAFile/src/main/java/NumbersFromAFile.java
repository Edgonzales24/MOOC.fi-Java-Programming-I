
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<String> list = new ArrayList<>();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                list.add(fileReader.nextLine());
            } 
        } catch (Exception e) {
            System.out.println("error reading the file");
        }
        
        int count = 0;
        for (String numbers: list) {
            int number = Integer.valueOf(numbers);
            if (number > lowerBound && number <=upperBound) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
