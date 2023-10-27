package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Indexof {
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
        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        for (var i = 0; i < numbers.size(); i++){
            if (numbers.get(i) == search){
                System.out.println(search + " is at index " + i);
            }
        }
    }
}