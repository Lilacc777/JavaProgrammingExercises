//Note: I don't have access to the original template for this exercise so I attempted to recreate something similar.

package Part3;
import java.util.Scanner;

public class Indexwasnotfound {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.print("Search for? ");
        Integer search = Integer.valueOf(scanner.nextLine());
        
        boolean trueOrFalse = false;
        for(int i = 0; i < 5; i++){
            if(numbers[i] == search) {
                System.out.println(search + " is at index " + i + ".");
                trueOrFalse = true;
            } else if (trueOrFalse == false && i == 4){
                System.out.println(search + " was not found.");
                break;
            } else {
                continue;
            }
        }
        scanner.close();
    }
}