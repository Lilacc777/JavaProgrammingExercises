package Part4;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingaSpecifiedFile {
    public static void main(String args[]){
        Scanner scannerForFile = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = scannerForFile.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        
        scannerForFile.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}