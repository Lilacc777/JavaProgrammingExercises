package Part2;

import java.util.Scanner;

public class Squarerootofsum {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer1 = Integer.valueOf(scanner.nextLine());
        int integer2 = Integer.valueOf(scanner.nextLine());

        int sum = integer1 + integer2;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
   } 
}
