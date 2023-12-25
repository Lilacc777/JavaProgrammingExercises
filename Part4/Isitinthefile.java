//Note: The TXT files "names.txt" and "other-names.txt" are used in this file.
package Part4;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Isitinthefile {
    public static void main(String args[]){
        Scanner scannerForFile = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scannerForFile.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                strings.add(row);
            }
        
        System.out.println("Search for:");
        String search = scannerForFile.nextLine();
        
        if(strings.contains(search)){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
        
        scannerForFile.close();

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}