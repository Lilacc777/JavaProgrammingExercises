package Part2;

public class Smallest {
    public static void main(String[] args) {
        int answer =  smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
    public static int smallest(int number1, int number2) {
        // write your code here
        // do not print anything inside the method
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }
    }
}