import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int temp = 0;
        for (int i = 0, j = numbers.length-1; i < j; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

    }
}
