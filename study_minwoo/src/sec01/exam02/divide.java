package sec01.exam02;

public class divide {
    void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("나누는 수는 0이 될 수 없다");
            return;
        } else {
            int result = num1/num2;
            System.out.println(num1 + "/" + num2 + "=" + result + "입니다.");
        }
    }
}
