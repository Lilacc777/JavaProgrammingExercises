package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumofalist {
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int integer = Integer.valueOf(scanner.nextLine());
            if(integer == -1){
                break;
            } else {
                numbers.add(integer);
            }
        }
        int sum = 0;
        for (int num: numbers){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}