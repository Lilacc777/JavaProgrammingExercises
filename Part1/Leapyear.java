package Part1;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a year: ");
        int year = Integer.valueOf(scanner.nextLine());
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}