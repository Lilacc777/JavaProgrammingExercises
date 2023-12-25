package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Onlythesenumbers {
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
        System.out.println("From where? " + numbers.get(0));
        System.out.println("To where? " + numbers.get(numbers.size() - 1));
        for(var i = 1; i < numbers.size() - 1; i++){
            System.out.println(numbers.get(i));
        }
        scanner.close();
    }
}