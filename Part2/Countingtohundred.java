package Part2;

import java.util.Scanner;

public class Countingtohundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = number; i < 101; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}