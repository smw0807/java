package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {


            System.out.print("What is your name?");
            String name = input.nextLine();

            if (name.equals("exit")) {
                System.out.println("Thanks for using our program.");
                break;
            }

            System.out.print("What is your age?");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("name: " + name + ", age: " + age);
        }
    }
}
