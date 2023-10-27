package Part3;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Rememberthesenumbers {
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
        for(var i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}