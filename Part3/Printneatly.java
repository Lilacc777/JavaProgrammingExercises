//Note: I don't have access to the original template for this exercise so I attempted to recreate something similar.
package Part3;

public class Printneatly {
    public static void main(String args[]){
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
    public static void printNeatly(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}