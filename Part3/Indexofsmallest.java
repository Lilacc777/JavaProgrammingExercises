package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Indexofsmallest {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999){
                break;
            } else {
                numbers.add(number);
            }
        }
        int smallest = numbers.get(0);
        for (var i = 0; i < numbers.size(); i++){
            if (smallest > numbers.get(i)){
                smallest = numbers.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (var i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
   }
}