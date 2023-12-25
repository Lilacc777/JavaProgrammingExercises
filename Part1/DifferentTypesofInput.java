package Part1;

import java.util.Scanner;

public class DifferentTypesofInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String message = scanner.nextLine();
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double decimal = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
       
        System.out.println("You gave the string " + message);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + decimal);
        System.out.println("You gave the boolean " + trueOrFalse);
        scanner.close();
    }
}