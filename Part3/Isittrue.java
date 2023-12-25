package Part3;

import java.util.Scanner;

public class Isittrue {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a string: ");
        String string = scanner.nextLine();
        if (string.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        scanner.close();
    }
}