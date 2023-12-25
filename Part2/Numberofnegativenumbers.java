package Part2;

import java.util.Scanner;

public class Numberofnegativenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                negatives = negatives + 1;
                continue;
            }
            if (number > 0) {
                continue;
            }
            if (number == 0) {
                break;
            }
        }

        System.out.println("Number of negative numbers: " + negatives);
        scanner.close();
    }
}