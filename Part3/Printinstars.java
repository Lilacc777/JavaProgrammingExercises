//Note: I don't have access to the original template for this exercise so I attempted to recreate something similar.
package Part3;

import java.util.ArrayList;

public class Printinstars {
    public static void main(String args[]){
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array){
        for (int i = 0; i < array.length; i++){
            printStars(array[i]);
        }
    }
    public static void printStars(int number){
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}