package scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt();

        String result = "입력한 숫자는 " + number;
        if (number % 2 == 0) {
            result += "짝수 입니다.";
        } else {
            result += "홀수 입니다.";
        }
        System.out.println(result);
    }
}
