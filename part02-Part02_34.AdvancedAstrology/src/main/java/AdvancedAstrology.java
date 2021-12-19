
public class AdvancedAstrology {

    public static void printStars(int number) {
        int stars = 1;
        while (stars <= number) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int time = 0;
        while (time < number) {
            System.out.print(" ");
            time++;
        }
    }

    public static void printTriangle(int size) {
        int height = 1;
        int spaces = size - 1;
        while (height <= size) {
            printSpaces(spaces);
            printStars(height);
            height++;
            spaces--;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(2 * i - 1);

            i++;
        }
        i = 2;
        while (--i >= 0) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
