
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        String user1 = "alex";
        String user2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";
        
        if (user.equals(user1) && pass.equals(pass1)) {
            System.out.println("You have successfully logged in!");
        } else if (user.equals(user2) && pass.equals(pass2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
