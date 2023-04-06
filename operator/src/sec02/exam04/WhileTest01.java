package sec02.exam04;

public class WhileTest01 {
    public static void main(String[] args) {
        int num1 = 1;
        int sum = 0;

        while (num1 <= 50) {
            sum += num1;
            num1++;
        }
        System.out.println("1부터 50까지의 합은" + sum + "입니다.");
    }
}
