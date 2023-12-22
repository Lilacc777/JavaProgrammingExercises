package Part3;

import java.util.Scanner;

public class Personaldetails {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int longestNumber = 0;
        String longestName = "";
        int sum = 0;
        int count = 0;
        while(true){
            String string = scanner.nextLine();
            if (string.equals("")){
                break;
            }
            String[] pieces = string.split(",");
            sum = sum + Integer.valueOf(pieces[pieces.length-1]);
            count = count + 1;
            if (pieces[0].length() > longestNumber){
                longestNumber = pieces[0].length();
                longestName = pieces[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }
}