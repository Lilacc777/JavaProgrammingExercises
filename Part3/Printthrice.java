package Part3;

import java.util.Scanner;

public class Printthrice {
    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word: ");
        String string = scanner.nextLine();
        System.out.print(string);
        System.out.print(string);
        System.out.println(string);
    }
}