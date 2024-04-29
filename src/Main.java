import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt(); // User input number
        int tempNumber = number; // Temporary variable
        int digitSum = 0; // Variable to store the sum of digits
        // Sum the digits of the number
        while (tempNumber != 0) {
            digitSum += tempNumber % 10; // Take the rightmost digit of the number
            tempNumber /= 10; // Remove the rightmost digit of the number
        }
        // Showing result.
        System.out.println("Sayıların toplamı: " + digitSum);
    }
}