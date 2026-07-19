package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("Enter an integer(-1 is exit): ");

        while((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("The average of the numbers is: " + average);
    }
}
