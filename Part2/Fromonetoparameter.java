package Part2;

public class Fromonetoparameter {
    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}