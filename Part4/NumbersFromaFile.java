//Note: The TXT files "numbers-1.txt" and "numbers-2.txt" are used in this file.
package Part4;

import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class NumbersFromaFile {
    public static void main(String args[]){
        Scanner scannerForFile = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("File? ");
        String file = scannerForFile.nextLine();
        System.out.print("Lower bound? ");
        int lower = Integer.valueOf(scannerForFile.nextLine());
        System.out.print("Upper bound? ");
        int upper = Integer.valueOf(scannerForFile.nextLine());
        int count = 0;

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                int number = Integer.valueOf(scanner.nextLine());
                if(number >= lower && number <= upper){
                    numbers.add(number);
                    count++;
                }
            }
        
        System.out.println("Numbers: " + count);
        
        scannerForFile.close();

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}