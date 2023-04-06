package sec.exam100;

import java.util.Scanner;

public class study {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = scanner.nextLine();
            System.out.println("이름 : " +inputData +"\"");
            inputData = scanner.nextLine();
            System.out.println("나이 :" +inputData + "\"");
            inputData = scanner.nextLine();
            System.out.println("전화번호 :" +inputData + "\"");
        }
    }
}
