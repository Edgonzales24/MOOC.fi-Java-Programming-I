
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(6);
        numbers.add(2);
        numbers.add(3);
        System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int nums: numbers) {
            sum += nums;
        }
        return sum;
    }

}
