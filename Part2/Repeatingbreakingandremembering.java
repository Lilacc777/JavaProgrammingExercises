package Part2;

import java.util.Scanner;

public class Repeatingbreakingandremembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");
        int number = 0;
        int sum = 0;
        int numberOfNumbers = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }
            if (number < 0 || number > 0) {
                sum += number;
                numberOfNumbers++;
                average = 1.0 * sum / numberOfNumbers;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                continue;
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        scanner.close();
    }
}