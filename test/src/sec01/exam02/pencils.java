package sec01.exam02;

import java.util.Scanner;

public class pencils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요. : ");
        String val1 = scanner.nextLine();
        double num1 = Double.parseDouble(val1);

        System.out.println("두 번째 수를 입력하세요. : ");
        String val2 = scanner.nextLine();
        double num2 = Double.parseDouble(val2);

        System.out.println("-----------------------------");

        if (num2 != 0.0) {
            System.out.println("결과 : " + (num1 / num2));
        } else {
            System.out.println("결과 : 무한대");
        }
    }
}
