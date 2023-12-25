package Part3;

public class Sumofarray {
    public static void main(String args[]){
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static void sumOfNumbersInArray(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}