package Part3;

import java.util.Scanner;

public class Linebyline {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(true){
        String string = scanner.nextLine();
        String[] pieces = string.split(" ");
            if (string.equals("")){
                break;
            } else {
                for (int i = 0; i < pieces.length; i++){
                System.out.println(pieces[i]);
                }
            }
        }
        scanner.close();
    }
}