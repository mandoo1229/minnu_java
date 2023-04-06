package sec01.exam09;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A'; //65

        //논리곱(AND)

        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자 이군요");
        }
        if ((charCode >= 97) & (charCode <= 122)) {
            System.out.println("소문자 이군요");
        }
        //논리곱(AND)
        //0~9 숫자 곱입니다.
        if (!(charCode < 48) && !(charCode > 57)) {
            System.out.println("0~9 숫자 입니다.");
        }
    }
}
