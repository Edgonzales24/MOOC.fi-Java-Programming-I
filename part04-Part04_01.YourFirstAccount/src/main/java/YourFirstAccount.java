
public class YourFirstAccount {

    public static void main(String[] args) {
        Account bankAccount = new Account("Eds Account", 100.00);
        bankAccount.deposit(20.0);
        System.out.println(bankAccount);
    }
}
