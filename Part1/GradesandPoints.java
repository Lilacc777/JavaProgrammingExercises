package Part1;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());
        if (points < 0) {
            System.out.println("impossible!");
        } else if (points <= 49) {
            System.out.println("failed");
        } else if (points <= 59) {
            System.out.println("Grade: 1");
        } else if (points <= 69) {
            System.out.println("Grade: 2");
        } else if (points <= 79) {
            System.out.println("Grade: 3");
        } else if (points <= 89) {
            System.out.println("Grade: 4");
        } else if (points <= 100) {
            System.out.println("Grade: 5");
        } else if (points > 100) {
            System.out.println("incredible!");
        }
    }
}