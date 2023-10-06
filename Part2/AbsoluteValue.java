package Part2;

import java.util.Scanner;

public class AbsoluteValue {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.valueOf(scanner.nextLine());
        int lessThanZero = integer * -1;

        if (integer < 0) {
            System.out.println(lessThanZero);
        } else {
            System.out.println(integer);
        }
   } 
}
