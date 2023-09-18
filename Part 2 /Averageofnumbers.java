import java.util.Scanner;

public class Averageofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfNumbers = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                sum = sum + number;
                numberOfNumbers = numberOfNumbers + 1;
                continue;
            }
            if (number > 0) {
                sum = sum + number;
                numberOfNumbers = numberOfNumbers + 1;
                continue;
            }
            if (number == 0) {
                break;
            }
        }

        double average = sum / numberOfNumbers;
        System.out.println("Average of the numbers: " + average);
    }
}