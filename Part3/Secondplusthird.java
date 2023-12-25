package Part3;

import java.util.Scanner;
import java.util.ArrayList;

public class Secondplusthird {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int integer = Integer.valueOf(scanner.nextLine());
            if(integer != 0){
                integers.add(integer);
            } else {
                break;
            }
        }
        System.out.println(integers.get(1) + integers.get(2));
        scanner.close();
    }
}