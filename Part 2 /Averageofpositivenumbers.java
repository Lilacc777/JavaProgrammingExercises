import java.util.Scanner;

public class Averageofpositivenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positive = 0;
        double sum = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                continue;
            }
            if (number > 0) {
                sum = sum + number;
                positive = positive + 1;
                continue;
            }
            if (number == 0) {
                break;
            }
        }

        double average = sum / positive;
        
        if (positive == 0 || positive < 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + average);
        }
    }
}