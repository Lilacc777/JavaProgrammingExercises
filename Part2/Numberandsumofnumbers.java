package Part2;

import java.util.Scanner;

public class Numberandsumofnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 0;
        int sum = 0;

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

        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}