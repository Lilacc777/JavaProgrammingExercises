//Note: The TXT file "data.txt" is used in this file.
package Part4;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingaFile {
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}