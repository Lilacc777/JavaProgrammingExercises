package Part2;

public class Advancedastrology {
    public static void main(String[] args) {
        printTriangle(4);
        christmasTree(10);
    }
    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }
    public static void christmasTree(int height) {
        for (int i = -1; i <= height-2; i++) {
            printSpaces(height-i);
            printStars(i+(i+3));
        }
            printSpaces(height);
            printStars(3);
            printSpaces(height);
            printStars(3);
    }
}
