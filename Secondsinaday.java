import java.util.Scanner;

public class Secondsinaday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int seconds = days * 86400;
        System.out.println(seconds);
    }
}
