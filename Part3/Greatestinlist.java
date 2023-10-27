package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Greatestinlist {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            } else {
                numbers.add(number);
            }
        }
        int greatest = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (greatest < number) {
            greatest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}