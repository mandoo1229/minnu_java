package sec01.exam09;

public class CatchOrderExample {
    public static void main(String[] args) throws NumberFormatException {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
