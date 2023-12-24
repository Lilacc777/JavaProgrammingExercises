package Part4;

import java.util.Scanner;

public class NumberofStrings {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            String string = scanner.nextLine();
            if(string.equals("end")){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}