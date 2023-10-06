package Part2;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int start = 0;

        for (int i = start; i < number + 1; i++) {
            System.out.println(i);
        }  
    }
}