

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }
    
    public static void printUntilNumber(int number) {
        int count = 1;
        while(number >= count) {
            System.out.println(count);
            count++;
        } 
    }

}
