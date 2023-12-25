package Part1;

import java.util.Scanner;

public class Averageoftwonumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        double result = (first + second) / 2.0;
        System.out.println("The average is " + result);
        scanner.close();
    }
}