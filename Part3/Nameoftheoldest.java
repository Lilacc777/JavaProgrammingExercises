package Part3;

import java.util.Scanner;

public class Nameoftheoldest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while(true){
            String string = scanner.nextLine();
            if (string.equals("")){
                break;
            }
            String[] pieces = string.split(",");
            if (Integer.valueOf(pieces[pieces.length-1]) > oldest){
                oldest = Integer.valueOf(pieces[pieces.length-1]);
                oldestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}