package Part3;

import java.util.Scanner;

public class Firstwords {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(true){
        String string = scanner.nextLine();
            if (string.equals("")){
                break;
            } else {
                String[] pieces = string.split(" ");
                System.out.println(pieces[0]);
            }
        }
        scanner.close();
    }
}