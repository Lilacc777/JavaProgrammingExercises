package Part4;

import java.util.Scanner;

public class Statistics {
    public static void main(String args[]){
        Statistics sum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            sum.addNumber(number);
            if(number % 2 == 0){
                evenSum.addNumber(number);
            } else {
                oddSum.addNumber(number);
            }
        }
        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
    }
    
    private int count;
    private int sum;

    public Statistics(){
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number){
        this.sum += number;
        count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
       return this.sum;
    }

    public double average() {
        return this.sum / this.count;
    }
}